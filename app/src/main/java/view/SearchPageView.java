package view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Observable;
import java.util.Observer;

import giakhang.kkk_mvvm.R;
import giakhang.kkk_mvvm.databinding.ActivitySearchPageViewBinding;
import viewmodel.SearchPageViewModel;

/**
 * Created by Khang Le on 11/10/2017.
 */

public class SearchPageView extends AppCompatActivity implements Observer {

    private ActivitySearchPageViewBinding activitySearchPageViewBinding;
    private SearchPageViewModel searchPageViewModel;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDataBinding();
    }

    private void initDataBinding() {

        activitySearchPageViewBinding = DataBindingUtil.setContentView(this, R.layout.activity_search_page_view);
        searchPageViewModel = new SearchPageViewModel(this);
        activitySearchPageViewBinding.setMainViewModel(searchPageViewModel);
    }



    public void setupObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override protected void onDestroy() {
        super.onDestroy();

    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
       // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

    private void startActivityActionView() {
        //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PeopleFactory.PROJECT_URL)));
    }

    @Override public void update(Observable observable, Object data) {

    }
}

