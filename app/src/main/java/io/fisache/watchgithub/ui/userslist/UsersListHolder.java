package io.fisache.watchgithub.ui.userslist;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.fisache.watchgithub.R;
import io.fisache.watchgithub.data.model.User;

public class UsersListHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.ivAvatar)
    ImageView ivAvatar;
    @Bind(R.id.tvLogin)
    TextView tvLogin;
    @Bind(R.id.tvDesc)
    TextView tvDesc;
    @Bind(R.id.ivSetting)
    ImageView ivSetting;

    public UsersListHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(User user) {
        tvLogin.setText(user.login);
        tvDesc.setText(user.desc);
    }
}
