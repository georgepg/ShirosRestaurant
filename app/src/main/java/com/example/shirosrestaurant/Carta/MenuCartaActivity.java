package com.example.shirosrestaurant.Carta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.shirosrestaurant.DRVinterface.LoadMore;
//import com.example.shirosrestaurant.DinamicRVAdapter;
import com.example.shirosrestaurant.R;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MenuCartaActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    //private CategoriasAdapter categoriasAdapter;
/*
    List<DinamicrvModel> items = new ArrayList();
    DinamicRVAdapter dinamicRVAdapter;
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_carta);
        /*
        final ArrayList<rvCategorias> item = new ArrayList<>();

        item.add(new rvCategorias(R.mipmap.broaster,"Broasters"));
        item.add(new rvCategorias(R.mipmap.salchipapa,"Salchipapas"));
        item.add(new rvCategorias(R.mipmap.burguer,"Hamburguesas"));
        item.add(new rvCategorias(R.mipmap.bebidas,"Bebidas"));

        recyclerView=findViewById(R.id.rvCategorias);
        categoriasAdapter = new CategoriasAdapter(item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(categoriasAdapter);

        items.add(new DinamicrvModel("Broaster Pecho"));
        items.add(new DinamicrvModel("Broaster Alista"));

        RecyclerView drv= findViewById(R.id.rvProductos);
        drv.setLayoutManager(new LinearLayoutManager(this));
        dinamicRVAdapter = new DinamicRVAdapter(drv,this,items);
        drv.setAdapter(dinamicRVAdapter);

        dinamicRVAdapter.setLoadMore(new LoadMore() {
            @Override
            public void onLoadMore() {
                if (items.size()<=10){
                    item.add(null);
                    dinamicRVAdapter.notifyItemInserted(items.size()-1);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            items.remove(items.size()-1);
                            dinamicRVAdapter.notifyItemRemoved(items.size());

                            int index = items.size();
                            int end = index+10;
                            for (int i = index; i<end; i++){
                                String nombre = UUID.randomUUID().toString();
                                DinamicrvModel item = new DinamicrvModel(nombre);
                                items.add(item);
                            }
                            dinamicRVAdapter.notifyDataSetChanged();
                            dinamicRVAdapter.setLoded();
                        }
                    },4000);
                }
                else
                    Toast.makeText(MenuCartaActivity.this,"Datos Completados",Toast.LENGTH_SHORT).show();
            }
        });
*/
    }
}