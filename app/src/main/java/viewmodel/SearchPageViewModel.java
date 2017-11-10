package viewmodel;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import view.SearchPageView;

/**
 * Created by Khang Le on 11/10/2017.
 */

public class SearchPageViewModel extends BaseObservable {
    private Integer _selectedGender;
    private Boolean _isFindingPartner;




    public SearchPageViewModel(SearchPageView searchPageView) {

        _selectedGender = 5;

    }






    public void FindPartner(View view)
    {

    }


    public void OnRoomFound()
    {
    }

    public Boolean get_isFindingPartner() {
        return _isFindingPartner;
    }

    public void set_isFindingPartner(Boolean _isFindingPartner) {
        this._isFindingPartner = _isFindingPartner;
    }

    public Integer get_selectedGender() {
        return _selectedGender;
    }

    public void set_selectedGender(Integer _selectedGender) {
        this._selectedGender = _selectedGender;
        notifyChange();
    }
}
