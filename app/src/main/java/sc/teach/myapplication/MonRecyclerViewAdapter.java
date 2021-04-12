package sc.teach.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MonRecyclerViewAdapter extends RecyclerView.Adapter<MonRecyclerViewAdapter.ConteneurDeDonnee> {
    private Context context;
    private ArrayList<Donnee> donnees;

    public MonRecyclerViewAdapter(Context context, ArrayList<Donnee> donnees) {
        this.donnees = donnees;
        this.context = context;
    }

    @Override
    public ConteneurDeDonnee onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new ConteneurDeDonnee(view);
    }

    @Override
    public void onBindViewHolder(ConteneurDeDonnee conteneur, int position) {
        String name = context.getString(R.string.name) + " : " + donnees.get(position).getName();
        conteneur.name.setText(name);
        String size = context.getString(R.string.pop) + " : " + donnees.get(position).getSize() + " k habitants.";
        conteneur.size.setText(size);
        conteneur.image.setImageResource(donnees.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return donnees.size();
    }

    public static class ConteneurDeDonnee extends RecyclerView.ViewHolder {
        TextView name;
        TextView size;
        ImageView image;

        public ConteneurDeDonnee(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            size = (TextView) itemView.findViewById(R.id.size);
            image = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

}
