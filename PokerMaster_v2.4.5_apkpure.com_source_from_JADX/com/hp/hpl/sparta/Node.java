package com.hp.hpl.sparta;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.hp.hpl.sparta.xpath.AttrEqualsExpr;
import com.hp.hpl.sparta.xpath.AttrExistsExpr;
import com.hp.hpl.sparta.xpath.AttrGreaterExpr;
import com.hp.hpl.sparta.xpath.AttrLessExpr;
import com.hp.hpl.sparta.xpath.AttrNotEqualsExpr;
import com.hp.hpl.sparta.xpath.BooleanExprVisitor;
import com.hp.hpl.sparta.xpath.PositionEqualsExpr;
import com.hp.hpl.sparta.xpath.Step;
import com.hp.hpl.sparta.xpath.TextEqualsExpr;
import com.hp.hpl.sparta.xpath.TextExistsExpr;
import com.hp.hpl.sparta.xpath.TextNotEqualsExpr;
import com.hp.hpl.sparta.xpath.TrueExpr;
import com.hp.hpl.sparta.xpath.XPath;
import com.hp.hpl.sparta.xpath.XPathException;
import com.illuminate.texaspoker.R.R;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import java.io.Writer;
import java.util.Enumeration;

public abstract class Node {
    private Object annotation_;
    private Document doc_;
    private int hash_;
    private Node nextSibling_;
    private Element parentNode_;
    private Node previousSibling_;

    /* renamed from: com.hp.hpl.sparta.Node.1 */
    class C03331 implements BooleanExprVisitor {
        private final Node this$0;
        private final String val$msgContext;
        private final Element val$newChild;
        private final Element val$parent;
        private final String val$tagName;

        C03331(Node node, Element element, Element element2, String str, String str2) {
            this.this$0 = node;
            this.val$newChild = element;
            this.val$parent = element2;
            this.val$msgContext = str;
            this.val$tagName = str2;
        }

        public void visit(AttrEqualsExpr attrEqualsExpr) {
            this.val$newChild.setAttribute(attrEqualsExpr.getAttrName(), attrEqualsExpr.getAttrValue());
        }

        public void visit(AttrExistsExpr attrExistsExpr) {
            this.val$newChild.setAttribute(attrExistsExpr.getAttrName(), "something");
        }

        public void visit(AttrGreaterExpr attrGreaterExpr) {
            this.val$newChild.setAttribute(attrGreaterExpr.getAttrName(), Long.toString(Long.MAX_VALUE));
        }

        public void visit(AttrLessExpr attrLessExpr) {
            this.val$newChild.setAttribute(attrLessExpr.getAttrName(), Long.toString(Long.MIN_VALUE));
        }

        public void visit(AttrNotEqualsExpr attrNotEqualsExpr) {
            this.val$newChild.setAttribute(attrNotEqualsExpr.getAttrName(), new StringBuffer("not ").append(attrNotEqualsExpr.getAttrValue()).toString());
        }

        public void visit(PositionEqualsExpr positionEqualsExpr) {
            int i = 1;
            int position = positionEqualsExpr.getPosition();
            if (this.val$parent != null || position == 1) {
                while (i < position) {
                    this.val$parent.appendChild(new Element(this.val$tagName));
                    i++;
                }
                return;
            }
            throw new XPathException(XPath.get(this.val$msgContext), "Position of root node must be 1");
        }

        public void visit(TextEqualsExpr textEqualsExpr) {
            this.val$newChild.appendChild(new Text(textEqualsExpr.getValue()));
        }

        public void visit(TextExistsExpr textExistsExpr) {
            this.val$newChild.appendChild(new Text("something"));
        }

        public void visit(TextNotEqualsExpr textNotEqualsExpr) {
            this.val$newChild.appendChild(new Text(new StringBuffer("not ").append(textNotEqualsExpr.getValue()).toString()));
        }

        public void visit(TrueExpr trueExpr) {
        }
    }

    static {
        fixHelper.fixfunc(new int[]{1241, 1242, 1243, 1244, 1245, 1246, 1247, 1248, 1249, 1250, 1251, 1252, 1253, 1254, 1255, 1256, 1257, 1258});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    protected static void htmlEncode(Writer writer, String str) {
        int i = 0;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            String str2;
            char charAt = str.charAt(i2);
            if (charAt < '\u0080') {
                switch (charAt) {
                    case GameRoomBaseInfo.ITHINKINGINTERVAL_FIELD_NUMBER /*34*/:
                        str2 = "&quot;";
                        break;
                    case R.AppCompatTheme_actionModeWebSearchDrawable /*38*/:
                        str2 = "&amp;";
                        break;
                    case R.AppCompatTheme_actionModePopupWindowStyle /*39*/:
                        str2 = "&#39;";
                        break;
                    case R.AppCompatTheme_toolbarNavigationButtonStyle /*60*/:
                        str2 = "&lt;";
                        break;
                    case R.AppCompatTheme_popupWindowStyle /*62*/:
                        str2 = "&gt;";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            }
            str2 = new StringBuffer("&#").append(charAt).append(";").toString();
            if (str2 != null) {
                writer.write(str, i, i2 - i);
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
    }

    public abstract Object clone();

    protected abstract int computeHashCode();

    public native Object getAnnotation();

    public native Node getNextSibling();

    public native Document getOwnerDocument();

    public native Element getParentNode();

    public native Node getPreviousSibling();

    public native int hashCode();

    native void insertAtEndOfLinkedList(Node node);

    native Element makeMatching(Element element, Step step, String str);

    native void notifyObservers();

    native void removeFromLinkedList();

    native void replaceInLinkedList(Node node);

    public native void setAnnotation(Object obj);

    native void setOwnerDocument(Document document);

    native void setParentNode(Element element);

    public native String toString();

    abstract void toString(Writer writer);

    public native String toXml();

    abstract void toXml(Writer writer);

    public abstract Element xpathSelectElement(String str);

    public abstract Enumeration xpathSelectElements(String str);

    public abstract String xpathSelectString(String str);

    public abstract Enumeration xpathSelectStrings(String str);

    public native boolean xpathSetStrings(String str, String str2);
}
