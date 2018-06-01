package com.example.maztec.celebstars.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.maztec.celebstars.Pojodata.HeaderData;
import com.example.maztec.celebstars.Pojodata.ItemResponse2;
import com.example.maztec.celebstars.Pojodata.actorsrcs;
import com.example.maztec.celebstars.R;

import java.security.PublicKey;
import java.util.List;

public class ImageRecyclerAdapter extends RecyclerView.Adapter<ImageRecyclerAdapter.GetHeadersrcs> {
    private Context context;
    private List<HeaderData> Hsrcs;

    public ImageRecyclerAdapter(Context context, List<HeaderData> hsrcs) {
        this.context = context;
        Hsrcs = hsrcs;
    }

    @NonNull
    @Override
    public ImageRecyclerAdapter.GetHeadersrcs onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View v=inflater.inflate(R.layout.single_header_design,parent,false);
        return new GetHeadersrcs(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageRecyclerAdapter.GetHeadersrcs holder, int position) {
        HeaderData hdata=Hsrcs.get(position);
        final String id=hdata.getId();
        Glide.with(context).load(hdata.getCat_image()).error(R.drawable.defaultceleb).into(holder.Headerimg1);
        Glide.with(context).load(hdata.getCat_image()).error(R.drawable.defaultceleb).into(holder.Headerimg2);

    }

    @Override
    public int getItemCount() {
        return Hsrcs.size();
    }

    public class GetHeadersrcs extends RecyclerView.ViewHolder {
        ImageView Headerimg1;
        ImageView Headerimg2;

        public GetHeadersrcs(View itemView) {
            super(itemView);

            Headerimg1=(ImageView) itemView.findViewById(R.id.circ1);
            Headerimg2=(ImageView)itemView.findViewById(R.id.circ2);
        }
    }

    public  void setHeaderdata(List<HeaderData> headerdata){
        this.Hsrcs=headerdata;
        notifyDataSetChanged();
    }
}

