package com.atguigu.android50_0220;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.atguigu.android50_0220.ainterface.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class TypeActivity extends AppCompatActivity {

    private List<String> list;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);


        rv = (RecyclerView) findViewById(R.id.rv);
        setData();
        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(new MyAdapter());
    }

    private void setData() {

        list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add("宋老师好坏" + i);
        }
    }


    class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            //viewtype分类型的值 （getItemViewType返回的类型值）
            if (viewType==0){

                View view = LayoutInflater.from(TypeActivity.this).inflate(R.layout.image_item,parent,false);

                return new HeadHolder(view);
            }
            View view = LayoutInflater.from(TypeActivity.this).inflate(R.layout.main_item,parent,false);

            return new MyHolder(view);
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        @Override
        public int getItemViewType(int position) {
            if (position==0){
                return 0;
            }
            return 1;
        }
    }

    class MyHolder extends RecyclerView.ViewHolder{

        private TextView tv;

        public MyHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv);
        }

    }
    class HeadHolder extends RecyclerView.ViewHolder{

        private TextView tv;

        public HeadHolder(View itemView) {
            super(itemView);

        }

    }
}
