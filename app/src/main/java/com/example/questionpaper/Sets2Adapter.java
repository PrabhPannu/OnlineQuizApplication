package com.example.questionpaper;

import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;

public class Sets2Adapter extends BaseAdapter {
    private int numOfSets;

    public Sets2Adapter(int numOfSets) {
        this.numOfSets = numOfSets;
    }


    @Override
    public int getCount() {
        return numOfSets;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        View view;
        if(convertView == null)
        {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.set_item_layout,parent,false);
        }else
        {
            view = convertView;
        }
        view .setOnClickListener(new View .OnClickListener()
        {

            @Override
            public void onClick(View v) {
            Intent intent =  new Intent( parent.getContext(),QuestionActivity.class );
            parent.getContext().startActivity( intent );
            }
        });
        //loop
        ((TextView) view.findViewById(R.id.setNo_tv)).setText(String.valueOf(position+1));

        return view;
    }
}


//
//    private void loadData()
//    {
//        catList.clear();
//        firestore.collection( "QuestionPaper").document("Categories")
//                .get().addOnSuccessListener(new OnCompleteListener<DocumentSnapshot>(){
//            @Override
//            public void onComplete(@NonNull Task<DocumentSnapshot> task)
//            {
//                if(task.isSuccessful())
//                {
//                    DocumentSnapshot doc =task.getResult();
//                    if(doc.exists())
//                    {
//                        long count = (long)doc.get("COUNT" );
//                        for(int i =0; i < count; i++)
//                        {
//                            String catName = doc.getString( "CAT"  + String.valueOf( i ));
//                            catList.add( catName );
//
//                        }
//                        Intent intent = new Intent( SplashActivity.this,MainActivity.class );
//                        startActivity(intent);
//                        SplashActivity.this.finish();
//                    }else
//                    {
//                        Toast.makeText( SplashActivity.this,"No Category Document Exits!",Toast.LENGTH_SHORT ).show();
//                        finish();
//                    }
//                }else
//                {
//                    Toast.makeText(SplashActivity.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
//                }
//            }