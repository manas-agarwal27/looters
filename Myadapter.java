import android.app.LauncherActivity;
import android.app.LauncherActivity.ListItem;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.looters.R;

import java.util.List;

public class Myadapter<textViewhead, textViewdesc> extends RecyclerView<ViewHolder> {

    public TextView textViewhead;
    public TextView textViewdesc;
    textViewhead=(TextView)findViewById(R.id.heading);
    textViewdesc = (TextView)findViewById(R.id.description);
}
    private List<ListItem> listItem;
    private Context context;

    public Myadapter(List<ListItem> listItem, Context context) {

        this.listItem = listItem;
        this.context = context;
    }

    public Myadapter(@NonNull Context context) {
        super(context);
    }

    public Myadapter(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Myadapter(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_items,parent,false)
                return new ViewHolder(v);
    }
    @Override
    public ViewHolder onBindViewHolder(ViewHolder holder, int position)
    {
        ListItem = listItem.get(position);
        holder.textViewhead.setText(listItem.get())
        holder.textViewdesc.setText(listItem.get())
    }

    @Override
    public int getItemCount()
    {
        return listItem.size();
    }
    public class Viewholder extends ViewHolder {
        public Viewholder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
