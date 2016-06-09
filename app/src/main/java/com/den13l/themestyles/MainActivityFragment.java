package com.den13l.themestyles;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivityFragment extends Fragment {

  @BindView(R.id.itemsContainer) LinearLayout itemsContainer;

  public MainActivityFragment() {
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_main, container, false);
    ButterKnife.bind(this, view);
    return view;
  }

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    showThree();

  }

  private void showThree() {
    LayoutInflater li = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    for (int i = 0; i < 10; i++) {
      View itemView = li.inflate(R.layout.item, itemsContainer, false);
      LinearLayout container = (LinearLayout) itemView.findViewById(R.id.itemContainer);
      ImageView imageView = (ImageView) itemView.findViewById(R.id.itemImage);
      Button buttonView = (Button) itemView.findViewById(R.id.itemButton);
      buttonView.setText(String.valueOf(i));

      itemsContainer.addView(itemView);
    }
  }
}
