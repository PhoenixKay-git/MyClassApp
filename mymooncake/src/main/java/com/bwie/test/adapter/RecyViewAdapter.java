package com.bwie.test.adapter;

import com.bumptech.glide.Glide;
import com.bwie.test.bean.MoonBean;
import com.bwie.test.mymooncake.R;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyViewAdapter extends RecyclerView.Adapter<RecyViewAdapter.MyRecyViewHolder>{
    private Context context;
    private List<MoonBean.DataBean> data;

    public RecyViewAdapter(Context context, List<MoonBean.DataBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyRecyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recyview, parent, false);
        MyRecyViewHolder recyViewHolder = new MyRecyViewHolder(view);
        return recyViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyViewHolder holder, int position) {
        MoonBean.DataBean dataBean = data.get(position);
        String[] split = dataBean.getImages().split("\\|");
        Glide.with(context).load(split[0]).into(holder.image_View);
        holder.text_title.setText(dataBean.getTitle());
        holder.text_price.setText("原价:"+dataBean.getPrice());
        holder.text_bargainPrice.setText("优惠价:"+dataBean.getBargainPrice());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyRecyViewHolder extends RecyclerView.ViewHolder {
        public ImageView image_View;
        public TextView text_title;
        public TextView text_price;
        public TextView text_bargainPrice;
        public MyRecyViewHolder(View itemView) {
            super(itemView);
            image_View = itemView.findViewById(R.id.image_view);
            text_title = itemView.findViewById(R.id.text_title);
            text_price = itemView.findViewById(R.id.text_price);
            text_bargainPrice = itemView.findViewById(R.id.text_bargainPrice);
        }
    }
}
