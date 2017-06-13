package com.example.asiantech.demokotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.asiantech.demokotlin.R
import com.example.asiantech.demokotlin.`interface`.onClickItemListener
import com.example.asiantech.demokotlin.model.User
import com.squareup.picasso.Picasso

/**
 * UersAdapter
 *
 * @author at-ToanNguyen
 */
class UserAdapter(private val mContext: Context, private val mData: List<User>, private var mListener: onClickItemListener) : RecyclerView.Adapter<UserAdapter.UserHolder>() {


    override fun onBindViewHolder(holder: UserHolder?, position: Int) {
        val item = mData[position]
        Picasso.with(mContext).load(item.imgUser).into(holder?.mImgUser);
        holder?.mUser?.setText(item.user)
        holder?.mAgeUser?.setText(item.ageUser)
    }

    override fun getItemCount(): Int {
        return mData.size;
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): UserHolder {
        val view: View = LayoutInflater.from(parent?.context).inflate(R.layout.layout_item_list, parent, false);
        return UserHolder(view);
    }

    inner class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mImgUser: ImageView
        var mUser: TextView
        var mAgeUser: TextView

        init {
            mImgUser = itemView.findViewById(R.id.imgUser) as ImageView
            mUser = itemView.findViewById(R.id.tvUser) as TextView
            mAgeUser = itemView.findViewById(R.id.tvAgeUser) as TextView
            itemView.setOnClickListener {
                mListener.onClickListener(adapterPosition)
            }
        }
    }
}