package com.nineoldandroids.animation;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import com.ali.fixHelper;
import com.android.volley.DefaultRetryPolicy;
import com.nineoldandroids.animation.Animator.AnimatorListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class AnimatorSet extends Animator {
    private ValueAnimator mDelayAnim;
    private long mDuration;
    private boolean mNeedsSort;
    private HashMap<Animator, Node> mNodeMap;
    private ArrayList<Node> mNodes;
    private ArrayList<Animator> mPlayingSet;
    private AnimatorSetListener mSetListener;
    private ArrayList<Node> mSortedNodes;
    private long mStartDelay;
    private boolean mStarted;
    boolean mTerminated;

    /* renamed from: com.nineoldandroids.animation.AnimatorSet.1 */
    class C09641 extends AnimatorListenerAdapter {
        boolean canceled;
        final /* synthetic */ ArrayList val$nodesToStart;

        C09641(ArrayList arrayList) {
            this.val$nodesToStart = arrayList;
            this.canceled = false;
        }

        public void onAnimationCancel(Animator animator) {
            this.canceled = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.canceled) {
                int size = this.val$nodesToStart.size();
                for (int i = 0; i < size; i++) {
                    Node node = (Node) this.val$nodesToStart.get(i);
                    node.animation.start();
                    AnimatorSet.this.mPlayingSet.add(node.animation);
                }
            }
        }
    }

    private class AnimatorSetListener implements AnimatorListener {
        private AnimatorSet mAnimatorSet;

        AnimatorSetListener(AnimatorSet animatorSet) {
            this.mAnimatorSet = animatorSet;
        }

        public void onAnimationCancel(Animator animator) {
            if (!AnimatorSet.this.mTerminated && AnimatorSet.this.mPlayingSet.size() == 0 && AnimatorSet.this.mListeners != null) {
                int size = AnimatorSet.this.mListeners.size();
                for (int i = 0; i < size; i++) {
                    ((AnimatorListener) AnimatorSet.this.mListeners.get(i)).onAnimationCancel(this.mAnimatorSet);
                }
            }
        }

        public void onAnimationEnd(Animator animator) {
            animator.removeListener(this);
            AnimatorSet.this.mPlayingSet.remove(animator);
            ((Node) this.mAnimatorSet.mNodeMap.get(animator)).done = true;
            if (!AnimatorSet.this.mTerminated) {
                int i;
                boolean z;
                ArrayList access$200 = this.mAnimatorSet.mSortedNodes;
                int size = access$200.size();
                for (i = 0; i < size; i++) {
                    if (!((Node) access$200.get(i)).done) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    if (AnimatorSet.this.mListeners != null) {
                        ArrayList arrayList = (ArrayList) AnimatorSet.this.mListeners.clone();
                        int size2 = arrayList.size();
                        for (i = 0; i < size2; i++) {
                            ((AnimatorListener) arrayList.get(i)).onAnimationEnd(this.mAnimatorSet);
                        }
                    }
                    this.mAnimatorSet.mStarted = false;
                }
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public class Builder {
        private Node mCurrentNode;

        Builder(Animator animator) {
            this.mCurrentNode = (Node) AnimatorSet.this.mNodeMap.get(animator);
            if (this.mCurrentNode == null) {
                this.mCurrentNode = new Node(animator);
                AnimatorSet.this.mNodeMap.put(animator, this.mCurrentNode);
                AnimatorSet.this.mNodes.add(this.mCurrentNode);
            }
        }

        public Builder with(Animator animator) {
            Node node = (Node) AnimatorSet.this.mNodeMap.get(animator);
            if (node == null) {
                node = new Node(animator);
                AnimatorSet.this.mNodeMap.put(animator, node);
                AnimatorSet.this.mNodes.add(node);
            }
            node.addDependency(new Dependency(this.mCurrentNode, 0));
            return this;
        }

        public Builder before(Animator animator) {
            Node node = (Node) AnimatorSet.this.mNodeMap.get(animator);
            if (node == null) {
                node = new Node(animator);
                AnimatorSet.this.mNodeMap.put(animator, node);
                AnimatorSet.this.mNodes.add(node);
            }
            node.addDependency(new Dependency(this.mCurrentNode, 1));
            return this;
        }

        public Builder after(Animator animator) {
            Node node = (Node) AnimatorSet.this.mNodeMap.get(animator);
            if (node == null) {
                node = new Node(animator);
                AnimatorSet.this.mNodeMap.put(animator, node);
                AnimatorSet.this.mNodes.add(node);
            }
            this.mCurrentNode.addDependency(new Dependency(node, 1));
            return this;
        }

        public Builder after(long j) {
            Animator ofFloat = ValueAnimator.ofFloat(0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
            ofFloat.setDuration(j);
            after(ofFloat);
            return this;
        }
    }

    private static class Dependency {
        static final int AFTER = 1;
        static final int WITH = 0;
        public Node node;
        public int rule;

        public Dependency(Node node, int i) {
            this.node = node;
            this.rule = i;
        }
    }

    private static class DependencyListener implements AnimatorListener {
        private AnimatorSet mAnimatorSet;
        private Node mNode;
        private int mRule;

        public DependencyListener(AnimatorSet animatorSet, Node node, int i) {
            this.mAnimatorSet = animatorSet;
            this.mNode = node;
            this.mRule = i;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            if (this.mRule == 1) {
                startIfReady(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            if (this.mRule == 0) {
                startIfReady(animator);
            }
        }

        private void startIfReady(Animator animator) {
            if (!this.mAnimatorSet.mTerminated) {
                Object obj;
                int size = this.mNode.tmpDependencies.size();
                for (int i = 0; i < size; i++) {
                    obj = (Dependency) this.mNode.tmpDependencies.get(i);
                    if (obj.rule == this.mRule && obj.node.animation == animator) {
                        animator.removeListener(this);
                        break;
                    }
                }
                obj = null;
                this.mNode.tmpDependencies.remove(obj);
                if (this.mNode.tmpDependencies.size() == 0) {
                    this.mNode.animation.start();
                    this.mAnimatorSet.mPlayingSet.add(this.mNode.animation);
                }
            }
        }
    }

    private static class Node implements Cloneable {
        public Animator animation;
        public ArrayList<Dependency> dependencies;
        public boolean done;
        public ArrayList<Node> nodeDependencies;
        public ArrayList<Node> nodeDependents;
        public ArrayList<Dependency> tmpDependencies;

        public Node(Animator animator) {
            this.dependencies = null;
            this.tmpDependencies = null;
            this.nodeDependencies = null;
            this.nodeDependents = null;
            this.done = false;
            this.animation = animator;
        }

        public void addDependency(Dependency dependency) {
            if (this.dependencies == null) {
                this.dependencies = new ArrayList();
                this.nodeDependencies = new ArrayList();
            }
            this.dependencies.add(dependency);
            if (!this.nodeDependencies.contains(dependency.node)) {
                this.nodeDependencies.add(dependency.node);
            }
            Node node = dependency.node;
            if (node.nodeDependents == null) {
                node.nodeDependents = new ArrayList();
            }
            node.nodeDependents.add(this);
        }

        public Node clone() {
            try {
                Node node = (Node) super.clone();
                node.animation = this.animation.clone();
                return node;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    static {
        fixHelper.fixfunc(new int[]{2999, 3000, 3001, 3002, 3003, 3004, 3005, 3006, 3007, 3008, 3009, 3010, 3011, 3012, 3013, 3014, 3015, 3016, 3017, 3018, 3019, 3020, 3021, 3022, 3023});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native void sortNodes();

    public final native void cancel();

    public final native /* bridge */ /* synthetic */ Animator clone();

    public final native AnimatorSet m6660clone();

    public final native /* bridge */ /* synthetic */ Object m6661clone();

    public final native void end();

    public final native ArrayList<Animator> getChildAnimations();

    public final native long getDuration();

    public final native long getStartDelay();

    public final native boolean isRunning();

    public final native boolean isStarted();

    public final native Builder play(Animator animator);

    public final native void playSequentially(List<Animator> list);

    public final native void playSequentially(Animator... animatorArr);

    public final native void playTogether(Collection<Animator> collection);

    public final native void playTogether(Animator... animatorArr);

    public final native /* bridge */ /* synthetic */ Animator setDuration(long j);

    public final native AnimatorSet m6662setDuration(long j);

    public final native void setInterpolator(Interpolator interpolator);

    public final native void setStartDelay(long j);

    public final native void setTarget(Object obj);

    public final native void setupEndValues();

    public final native void setupStartValues();

    public final native void start();
}
