package com.example.logcathealth;

import android.os.Bundle;

import com.example.logcathealth.BottomNav.ClickedCallBack;
import com.example.logcathealth.BottomNav.MenuAdapter;
import com.example.logcathealth.BottomNav.MenuItem;
import com.example.logcathealth.BottomNav.MenuUtil;
import com.example.logcathealth.ui.DocCorner.DocCornerFragment;
import com.example.logcathealth.ui.Marketplace.MarketplaceFragment;
import com.example.logcathealth.ui.Profile.ProfileFragment;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.logcathealth.databinding.ActivityBottomNavigationBinding;

import java.util.List;

public class BottomNavigation extends AppCompatActivity implements ClickedCallBack {
        RecyclerView recyclerView;
        List<MenuItem> menu;
        MenuAdapter menuAdapter;
        int selectedMenuPos = 0 ;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bottom_navigation);
            getSupportActionBar().hide();

            // setup side menu
            setupSideMenu();

            // set the default fragment when activity launch
            setProfileFragment();

        }

        private void setupSideMenu() {

            recyclerView = findViewById(R.id.recyclerview);

            // get menu list item  will get data from a static data class

            menu = MenuUtil.getMenuList();
            menuAdapter = new MenuAdapter(menu, this);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(menuAdapter);

        }

        void setDocCornerfragment() {

            getSupportFragmentManager().beginTransaction().replace(R.id.container,new DocCornerFragment()).commit();

        }

        void setMarketplaceFragment () {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,new MarketplaceFragment()).commit();
        }

        void setProfileFragment() {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,new ProfileFragment()).commit();
        }


        @Override
        public void onMenuItemClick(int i) {

            switch (menu.get(i).getCode()) {

                case MenuUtil.PROFILE_FRAGMENT:
                    setProfileFragment();
                    break;
                case MenuUtil.MARKETPLACE_FRAGMENT:
                    setMarketplaceFragment();
                    break;
                case MenuUtil.DOCCORNER_FRAGMENT:
                    setDocCornerfragment();
                    break;
                default:
                    setDocCornerfragment();
            }

            // highlight the selected menu item

            menu.get(selectedMenuPos).setSelected(false);
            menu.get(i).setSelected(true);
            selectedMenuPos = i;
           menuAdapter.notifyDataSetChanged();

        }
}