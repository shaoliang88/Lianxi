package com.example.lenovo.lianxi.Adapter;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.lenovo.lianxi.Bean.Bean;
import com.example.lenovo.lianxi.R;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Created by lenovo on 2018/4/9.
 */
public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private Bean bean;
    private ViewHolderOne one;
    private GenericDraweeHierarchy build1;


    public OnItemClickListener getListener() {
        return listener;
    }

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    private OnItemClickListener listener;
    public MyAdapter(Context context, Bean bean) {
        this.context = context;
        this.bean = bean;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = View.inflate(context, R.layout.item_one, null);
        ViewHolderOne one = new ViewHolderOne(v);
        return one;
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
         one = (ViewHolderOne) holder;
        one.simpl.setImageURI(bean.getShowapi_res_body().getNewslist().get(position).getPicUrl());
        one.tv.setText(bean.getShowapi_res_body().getNewslist().get(position).getTitle());
        one.simpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.Click(view,position);
            }
        });
        if (position%2==0){
             build1 = GenericDraweeHierarchyBuilder.newInstance(context.getResources())
                    .setRoundingParams(RoundingParams.fromCornersRadius(30))
                    .build();
       }else {
             build1 = GenericDraweeHierarchyBuilder.newInstance(context.getResources())
                    .setRoundingParams(RoundingParams.asCircle())
                    .setFadeDuration(3000)
                    .build();
        }
    one.simpl.setHierarchy(build1);
    }
    @Override
    public int getItemCount() {
        return bean.getShowapi_res_body().getNewslist().size();
    }
    static class ViewHolderOne extends RecyclerView.ViewHolder {
        @BindView(R.id.simpl)
        SimpleDraweeView simpl;
        @BindView(R.id.tv)
        TextView tv;
        ViewHolderOne(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
    public  interface OnItemClickListener{
        public void Click(View view,int position);
    }
}
