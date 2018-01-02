import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by student on 2017-12-18.
 */
// 8. Utwórz klasę ViewHoldera

public class ViewHolder extends RecyclerView.ViewHolder
{
    public ViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
    private void setPlacesName(String nam)
    {
        placeName.setText(nam);
    }

    private void setPlacesInformation(String inf )
    {
        information.setText(inf);
    }

}
