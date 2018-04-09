package com.example.lenovo.lianxi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.lenovo.lianxi.Adapter.MyAdapter;
import com.example.lenovo.lianxi.Bean.Bean;
import com.example.lenovo.lianxi.Presenter.getPresenter;
import com.example.lenovo.lianxi.View.getView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements getView {

    @BindView(R.id.recycler)
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        getPresenter p=new getPresenter(this);
        p.getShu();
    }
    @Override
    public void getShow(final Bean bean) {
        MyAdapter adapter=new MyAdapter(this,bean);
recycler.setAdapter(adapter);
adapter.setListener(new MyAdapter.OnItemClickListener() {
    @Override
    public void Click(View view, int position) {
        Toast.makeText(MainActivity.this, position+"", Toast.LENGTH_SHORT).show();
    }
});
    }
}
