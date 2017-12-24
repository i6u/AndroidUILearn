package com.example.witt.qmuilearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.qmuiteam.qmui.widget.dialog.QMUIBottomSheet;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void showSimpleBottomSheetList(View view) {
        new QMUIBottomSheet.BottomListSheetBuilder(view.getContext())
                .addItem("Item 1")
                .addItem("Item 2")
                .addItem("Item 3")
                .setOnSheetItemClickListener(new QMUIBottomSheet.BottomListSheetBuilder.OnSheetItemClickListener() {
                    @Override
                    public void onClick(QMUIBottomSheet dialog, View itemView, int position, String tag) {
                        dialog.dismiss();
                        Toast.makeText(itemView.getContext(), "Item " + (position + 1), Toast.LENGTH_SHORT).show();
                    }
                })
                .build()
                .show();
    }
    //
    //public void showSimpleBottomGridSheetBuilder(View view) {
    //    new QMUIBottomSheet.BottomGridSheetBuilder(view.getContext())
    //            .addItem(R.mipmap.icon_more_operation_share_friend, "分享到微信", 3, QMUIBottomSheet.BottomGridSheetBuilder.FIRST_LINE)
    //            .setOnSheetItemClickListener(new QMUIBottomSheet.BottomGridSheetBuilder.OnSheetItemClickListener() {
    //                @Override
    //                public void onClick(QMUIBottomSheet dialog, View itemView) {
    //
    //                }
    //            }).build().show();
    //}
}
