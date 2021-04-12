package sc.teach.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MonRecyclerViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MonRecyclerViewAdapter(this, getDataSource());
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<Donnee> getDataSource() {
        ArrayList results = new ArrayList<Donnee>();
        String[] names = {getString(R.string.france), getString(R.string.italie), getString(R.string.pays_bas), getString(R.string.royaumes_unis), getString(R.string.espagne)};
        int[] populations = {67, 60, 17, 66, 47};
        int[] images = {R.drawable.ic_france_foreground, R.drawable.ic_italie_foreground, R.drawable.ic_paysbas_foreground, R.drawable.ic_uk_foreground, R.drawable.ic_espagne_foreground};
        for(int i = 0; i < names.length; i++){
            results.add(new Donnee(names[i], populations[i], images[i]));
        }
        return results;
    }

}