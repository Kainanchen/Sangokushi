package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.ActionProvider.VisibilityListener;
import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.menu.MenuView.ItemView;
import android.util.Log;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.PushMsg;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class MenuItemImpl implements SupportMenuItem {
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private static final int IS_ACTION = 32;
    static final int NO_ICON = 0;
    private static final int SHOW_AS_ACTION_MASK = 3;
    private static final String TAG = "MenuItemImpl";
    private static String sDeleteShortcutLabel;
    private static String sEnterShortcutLabel;
    private static String sPrependShortcutLabel;
    private static String sSpaceShortcutLabel;
    private ActionProvider mActionProvider;
    private View mActionView;
    private final int mCategoryOrder;
    private OnMenuItemClickListener mClickListener;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private int mIconResId;
    private final int mId;
    private Intent mIntent;
    private boolean mIsActionViewExpanded;
    private Runnable mItemCallback;
    MenuBuilder mMenu;
    private ContextMenuInfo mMenuInfo;
    private OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private int mShowAsAction;
    private SubMenuBuilder mSubMenu;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;

    /* renamed from: android.support.v7.view.menu.MenuItemImpl.1 */
    class C01901 implements VisibilityListener {
        C01901() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            MenuItemImpl.this.mMenu.onItemVisibleChanged(MenuItemImpl.this);
        }
    }

    MenuItemImpl(MenuBuilder menuBuilder, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.mIconResId = NO_ICON;
        this.mFlags = ENABLED;
        this.mShowAsAction = NO_ICON;
        this.mIsActionViewExpanded = false;
        this.mMenu = menuBuilder;
        this.mId = i2;
        this.mGroup = i;
        this.mCategoryOrder = i3;
        this.mOrdering = i4;
        this.mTitle = charSequence;
        this.mShowAsAction = i5;
    }

    public final boolean invoke() {
        if ((this.mClickListener != null && this.mClickListener.onMenuItemClick(this)) || this.mMenu.dispatchMenuItemSelected(this.mMenu.getRootMenu(), this)) {
            return true;
        }
        if (this.mItemCallback != null) {
            this.mItemCallback.run();
            return true;
        }
        if (this.mIntent != null) {
            try {
                this.mMenu.getContext().startActivity(this.mIntent);
                return true;
            } catch (Throwable e) {
                Log.e(TAG, "Can't find activity to handle intent; ignoring", e);
            }
        }
        if (this.mActionProvider == null || !this.mActionProvider.onPerformDefaultAction()) {
            return false;
        }
        return true;
    }

    public final boolean isEnabled() {
        return (this.mFlags & ENABLED) != 0;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.mFlags |= ENABLED;
        } else {
            this.mFlags &= -17;
        }
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final int getGroupId() {
        return this.mGroup;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.mId;
    }

    public final int getOrder() {
        return this.mCategoryOrder;
    }

    public final int getOrdering() {
        return this.mOrdering;
    }

    public final Intent getIntent() {
        return this.mIntent;
    }

    public final MenuItem setIntent(Intent intent) {
        this.mIntent = intent;
        return this;
    }

    final Runnable getCallback() {
        return this.mItemCallback;
    }

    public final MenuItem setCallback(Runnable runnable) {
        this.mItemCallback = runnable;
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.mShortcutAlphabeticChar != c) {
            this.mShortcutAlphabeticChar = Character.toLowerCase(c);
            this.mMenu.onItemsChanged(false);
        }
        return this;
    }

    public final char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.mShortcutNumericChar != c) {
            this.mShortcutNumericChar = c;
            this.mMenu.onItemsChanged(false);
        }
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.mShortcutNumericChar = c;
        this.mShortcutAlphabeticChar = Character.toLowerCase(c2);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    final char getShortcut() {
        return this.mMenu.isQwertyMode() ? this.mShortcutAlphabeticChar : this.mShortcutNumericChar;
    }

    final String getShortcutLabel() {
        char shortcut = getShortcut();
        if (shortcut == '\u0000') {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        StringBuilder stringBuilder = new StringBuilder(sPrependShortcutLabel);
        switch (shortcut) {
            case HIDDEN /*8*/:
                stringBuilder.append(sDeleteShortcutLabel);
                break;
            case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                stringBuilder.append(sEnterShortcutLabel);
                break;
            case IS_ACTION /*32*/:
                stringBuilder.append(sSpaceShortcutLabel);
                break;
            default:
                stringBuilder.append(shortcut);
                break;
        }
        return stringBuilder.toString();
    }

    final boolean shouldShowShortcut() {
        return this.mMenu.isShortcutsVisible() && getShortcut() != '\u0000';
    }

    public final SubMenu getSubMenu() {
        return this.mSubMenu;
    }

    public final boolean hasSubMenu() {
        return this.mSubMenu != null;
    }

    public final void setSubMenu(SubMenuBuilder subMenuBuilder) {
        this.mSubMenu = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.mTitle;
    }

    final CharSequence getTitleForItemView(ItemView itemView) {
        if (itemView == null || !itemView.prefersCondensedTitle()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        this.mMenu.onItemsChanged(false);
        if (this.mSubMenu != null) {
            this.mSubMenu.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle(this.mMenu.getContext().getString(i));
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.mTitleCondensed != null ? this.mTitleCondensed : this.mTitle;
        if (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.mTitleCondensed = charSequence;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final Drawable getIcon() {
        if (this.mIconDrawable != null) {
            return this.mIconDrawable;
        }
        if (this.mIconResId == 0) {
            return null;
        }
        Drawable drawable = AppCompatResources.getDrawable(this.mMenu.getContext(), this.mIconResId);
        this.mIconResId = NO_ICON;
        this.mIconDrawable = drawable;
        return drawable;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.mIconResId = NO_ICON;
        this.mIconDrawable = drawable;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.mIconDrawable = null;
        this.mIconResId = i;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final boolean isCheckable() {
        return (this.mFlags & CHECKABLE) == CHECKABLE;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.mFlags;
        this.mFlags = (z ? CHECKABLE : NO_ICON) | (this.mFlags & -2);
        if (i != this.mFlags) {
            this.mMenu.onItemsChanged(false);
        }
        return this;
    }

    public final void setExclusiveCheckable(boolean z) {
        this.mFlags = (z ? EXCLUSIVE : NO_ICON) | (this.mFlags & -5);
    }

    public final boolean isExclusiveCheckable() {
        return (this.mFlags & EXCLUSIVE) != 0;
    }

    public final boolean isChecked() {
        return (this.mFlags & CHECKED) == CHECKED;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.mFlags & EXCLUSIVE) != 0) {
            this.mMenu.setExclusiveItemChecked(this);
        } else {
            setCheckedInt(z);
        }
        return this;
    }

    final void setCheckedInt(boolean z) {
        int i;
        int i2 = this.mFlags;
        int i3 = this.mFlags & -3;
        if (z) {
            i = CHECKED;
        } else {
            i = NO_ICON;
        }
        this.mFlags = i | i3;
        if (i2 != this.mFlags) {
            this.mMenu.onItemsChanged(false);
        }
    }

    public final boolean isVisible() {
        if (this.mActionProvider == null || !this.mActionProvider.overridesItemVisibility()) {
            if ((this.mFlags & HIDDEN) != 0) {
                return false;
            }
            return true;
        } else if ((this.mFlags & HIDDEN) == 0 && this.mActionProvider.isVisible()) {
            return true;
        } else {
            return false;
        }
    }

    final boolean setVisibleInt(boolean z) {
        int i = this.mFlags;
        this.mFlags = (z ? NO_ICON : HIDDEN) | (this.mFlags & -9);
        if (i != this.mFlags) {
            return true;
        }
        return false;
    }

    public final MenuItem setVisible(boolean z) {
        if (setVisibleInt(z)) {
            this.mMenu.onItemVisibleChanged(this);
        }
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mClickListener = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        return this.mTitle != null ? this.mTitle.toString() : null;
    }

    final void setMenuInfo(ContextMenuInfo contextMenuInfo) {
        this.mMenuInfo = contextMenuInfo;
    }

    public final ContextMenuInfo getMenuInfo() {
        return this.mMenuInfo;
    }

    public final void actionFormatChanged() {
        this.mMenu.onItemActionRequestChanged(this);
    }

    public final boolean shouldShowIcon() {
        return this.mMenu.getOptionalIconsVisible();
    }

    public final boolean isActionButton() {
        return (this.mFlags & IS_ACTION) == IS_ACTION;
    }

    public final boolean requestsActionButton() {
        return (this.mShowAsAction & CHECKABLE) == CHECKABLE;
    }

    public final boolean requiresActionButton() {
        return (this.mShowAsAction & CHECKED) == CHECKED;
    }

    public final void setIsActionButton(boolean z) {
        if (z) {
            this.mFlags |= IS_ACTION;
        } else {
            this.mFlags &= -33;
        }
    }

    public final boolean showsTextAsAction() {
        return (this.mShowAsAction & EXCLUSIVE) == EXCLUSIVE;
    }

    public final void setShowAsAction(int i) {
        switch (i & SHOW_AS_ACTION_MASK) {
            case NO_ICON /*0*/:
            case CHECKABLE /*1*/:
            case CHECKED /*2*/:
                this.mShowAsAction = i;
                this.mMenu.onItemActionRequestChanged(this);
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final SupportMenuItem setActionView(View view) {
        this.mActionView = view;
        this.mActionProvider = null;
        if (view != null && view.getId() == -1 && this.mId > 0) {
            view.setId(this.mId);
        }
        this.mMenu.onItemActionRequestChanged(this);
        return this;
    }

    public final SupportMenuItem setActionView(int i) {
        Context context = this.mMenu.getContext();
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final View getActionView() {
        if (this.mActionView != null) {
            return this.mActionView;
        }
        if (this.mActionProvider == null) {
            return null;
        }
        this.mActionView = this.mActionProvider.onCreateActionView(this);
        return this.mActionView;
    }

    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final ActionProvider getSupportActionProvider() {
        return this.mActionProvider;
    }

    public final SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        if (this.mActionProvider != null) {
            this.mActionProvider.reset();
        }
        this.mActionView = null;
        this.mActionProvider = actionProvider;
        this.mMenu.onItemsChanged(true);
        if (this.mActionProvider != null) {
            this.mActionProvider.setVisibilityListener(new C01901());
        }
        return this;
    }

    public final SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final boolean expandActionView() {
        if (!hasCollapsibleActionView()) {
            return false;
        }
        if (this.mOnActionExpandListener == null || this.mOnActionExpandListener.onMenuItemActionExpand(this)) {
            return this.mMenu.expandItemActionView(this);
        }
        return false;
    }

    public final boolean collapseActionView() {
        if ((this.mShowAsAction & HIDDEN) == 0) {
            return false;
        }
        if (this.mActionView == null) {
            return true;
        }
        if (this.mOnActionExpandListener == null || this.mOnActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.mMenu.collapseItemActionView(this);
        }
        return false;
    }

    public final SupportMenuItem setSupportOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.mOnActionExpandListener = onActionExpandListener;
        return this;
    }

    public final boolean hasCollapsibleActionView() {
        if ((this.mShowAsAction & HIDDEN) == 0) {
            return false;
        }
        if (this.mActionView == null && this.mActionProvider != null) {
            this.mActionView = this.mActionProvider.onCreateActionView(this);
        }
        if (this.mActionView != null) {
            return true;
        }
        return false;
    }

    public final void setActionViewExpanded(boolean z) {
        this.mIsActionViewExpanded = z;
        this.mMenu.onItemsChanged(false);
    }

    public final boolean isActionViewExpanded() {
        return this.mIsActionViewExpanded;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }
}
