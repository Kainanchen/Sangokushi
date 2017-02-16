package com.facebook.p051j.p052a;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.p036h.af;
import com.facebook.p036h.ag;
import com.facebook.p051j.p053b.ShareContent;
import com.facebook.p051j.p053b.ShareLinkContent;
import com.facebook.p051j.p053b.ShareMedia;
import com.facebook.p051j.p053b.ShareMediaContent;
import com.facebook.p051j.p053b.ShareOpenGraphContent;
import com.facebook.p051j.p053b.ShareOpenGraphObject;
import com.facebook.p051j.p053b.ShareOpenGraphValueContainer;
import com.facebook.p051j.p053b.SharePhoto;
import com.facebook.p051j.p053b.SharePhotoContent;
import com.facebook.p051j.p053b.ShareVideo;
import com.facebook.p051j.p053b.ShareVideoContent;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.j.a.h */
public final class ShareContentValidation {
    public static ShareContentValidation f2531a;
    private static ShareContentValidation f2532b;

    /* renamed from: com.facebook.j.a.h.a */
    private static class ShareContentValidation {
        boolean f2530a;

        private ShareContentValidation() {
            this.f2530a = false;
        }

        public void m2460a(ShareMediaContent shareMediaContent) {
            List<ShareMedia> list = shareMediaContent.f2596a;
            if (list == null || list.isEmpty()) {
                throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
            } else if (list.size() > 6) {
                throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", new Object[]{Integer.valueOf(6)}));
            } else {
                for (ShareMedia shareMedia : list) {
                    if (shareMedia instanceof SharePhoto) {
                        m2462a((SharePhoto) shareMedia);
                    } else if (shareMedia instanceof ShareVideo) {
                        ShareContentValidation.m2459a((ShareVideo) shareMedia);
                    } else {
                        throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", new Object[]{shareMedia.getClass().getSimpleName()}));
                    }
                }
            }
        }

        public final void m2461a(ShareOpenGraphValueContainer shareOpenGraphValueContainer, boolean z) {
            for (String str : shareOpenGraphValueContainer.f2598a.keySet()) {
                if (z) {
                    String[] split = str.split(":");
                    if (split.length < 2) {
                        throw new FacebookException("Open Graph keys must be namespaced: %s", str);
                    }
                    for (String isEmpty : split) {
                        if (isEmpty.isEmpty()) {
                            throw new FacebookException("Invalid key found in Open Graph dictionary: %s", str);
                        }
                    }
                }
                Object a = shareOpenGraphValueContainer.m2508a(str);
                if (a instanceof List) {
                    for (Object next : (List) a) {
                        if (next == null) {
                            throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                        }
                        ShareContentValidation.m2470a(next, this);
                    }
                    continue;
                } else {
                    ShareContentValidation.m2470a(a, this);
                }
            }
        }

        public void m2463a(ShareVideoContent shareVideoContent) {
            ShareContentValidation.m2459a(shareVideoContent.f2616d);
            SharePhoto sharePhoto = shareVideoContent.f2615c;
            if (sharePhoto != null) {
                m2462a(sharePhoto);
            }
        }

        public void m2462a(SharePhoto sharePhoto) {
            ShareContentValidation.m2469a(sharePhoto);
            Bitmap bitmap = sharePhoto.f2605b;
            Uri uri = sharePhoto.f2606c;
            if (bitmap == null && af.m1530b(uri) && !this.f2530a) {
                throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            } else if (sharePhoto.f2605b != null || !af.m1530b(sharePhoto.f2606c)) {
                ag.m1552d(FacebookSdk.m2586f());
            }
        }

        private static void m2459a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                throw new FacebookException("Cannot share a null ShareVideo");
            }
            Uri uri = shareVideo.f2612b;
            if (uri == null) {
                throw new FacebookException("ShareVideo does not have a LocalUrl specified");
            } else if (!af.m1534c(uri) && !af.m1537d(uri)) {
                throw new FacebookException("ShareVideo must reference a video that is on the device");
            }
        }
    }

    /* renamed from: com.facebook.j.a.h.b */
    private static class ShareContentValidation extends ShareContentValidation {
        private ShareContentValidation() {
            super();
        }

        public final void m2466a(ShareVideoContent shareVideoContent) {
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }

        public final void m2464a(ShareMediaContent shareMediaContent) {
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        public final void m2465a(SharePhoto sharePhoto) {
            ShareContentValidation.m2469a(sharePhoto);
        }
    }

    public static void m2468a(ShareContent shareContent, ShareContentValidation shareContentValidation) {
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        } else if (shareContent instanceof ShareLinkContent) {
            Uri uri = ((ShareLinkContent) shareContent).f2589c;
            if (uri != null && !af.m1530b(uri)) {
                throw new FacebookException("Image Url must be an http:// or https:// url");
            }
        } else if (shareContent instanceof SharePhotoContent) {
            List<SharePhoto> list = ((SharePhotoContent) shareContent).f2610a;
            if (list == null || list.isEmpty()) {
                throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
            } else if (list.size() > 6) {
                throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", new Object[]{Integer.valueOf(6)}));
            } else {
                for (SharePhoto a : list) {
                    shareContentValidation.m2462a(a);
                }
            }
        } else if (shareContent instanceof ShareVideoContent) {
            shareContentValidation.m2463a((ShareVideoContent) shareContent);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            shareContentValidation.f2530a = true;
            ShareOpenGraphValueContainer shareOpenGraphValueContainer = shareOpenGraphContent.f2599a;
            if (shareOpenGraphValueContainer == null) {
                throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
            } else if (af.m1523a(shareOpenGraphValueContainer.m2509a())) {
                throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
            } else {
                shareContentValidation.m2461a(shareOpenGraphValueContainer, false);
                String str = shareOpenGraphContent.f2600b;
                if (af.m1523a(str)) {
                    throw new FacebookException("Must specify a previewPropertyName.");
                } else if (shareOpenGraphContent.f2599a.m2508a(str) == null) {
                    throw new FacebookException("Property \"" + str + "\" was not found on the action. The name of the preview property must match the name of an action property.");
                }
            }
        } else if (shareContent instanceof ShareMediaContent) {
            shareContentValidation.m2460a((ShareMediaContent) shareContent);
        }
    }

    static void m2469a(SharePhoto sharePhoto) {
        if (sharePhoto == null) {
            throw new FacebookException("Cannot share a null SharePhoto");
        }
        Bitmap bitmap = sharePhoto.f2605b;
        Uri uri = sharePhoto.f2606c;
        if (bitmap == null && uri == null) {
            throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    static void m2470a(Object obj, ShareContentValidation shareContentValidation) {
        if (obj instanceof ShareOpenGraphObject) {
            ShareOpenGraphObject shareOpenGraphObject = (ShareOpenGraphObject) obj;
            if (shareOpenGraphObject == null) {
                throw new FacebookException("Cannot share a null ShareOpenGraphObject");
            }
            shareContentValidation.m2461a(shareOpenGraphObject, true);
        } else if (obj instanceof SharePhoto) {
            shareContentValidation.m2462a((SharePhoto) obj);
        }
    }

    public static void m2467a(ShareContent shareContent) {
        if (f2532b == null) {
            f2532b = new ShareContentValidation();
        }
        ShareContentValidation.m2468a(shareContent, f2532b);
    }
}
