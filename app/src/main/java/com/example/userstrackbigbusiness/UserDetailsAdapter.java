package com.example.userstrackbigbusiness;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.userstrackbigbusiness.UserDetails.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class UserDetailsAdapter extends RecyclerView.Adapter<UserDetailsAdapter.ViewHolder> {

    List<User> UserDetailsList;
    Context context;
    User userData;
    ViewGroup parent;


    public UserDetailsAdapter(Context context, List<User> UserDetailsList) {
        this.context  = context;
        this.UserDetailsList = UserDetailsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.userscard, parent, false);
        this.parent = parent;
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      User user = this.UserDetailsList.get(position);
      if(user.getDateOfJoining()!=null) {
          long date = Long.parseLong(user.getDateOfJoining());
          DateFormat simple = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z");
          Date result = new Date(date);
          holder.DateOfJoining.setText(simple.format(result));
      }
      holder.OwnerName.setText(user.getName());
      holder.BusinessName.setText(user.getBusinessName());
      holder.userscard.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
          Intent i = new Intent(parent.getContext(),UserCardDetails.class);
          user.setProfileImage(null);
          i.putExtra("User Details",user);
          context.startActivity(i);
          }
      });
    }


    @Override
    public int getItemCount(){
        return UserDetailsList.size();
    }
    public  User getUserData(){
       return userData;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView userscard;
        TextView DateOfJoining,BusinessName,OwnerName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userscard = itemView.findViewById(R.id.userdetailsCard);
            BusinessName = itemView.findViewById(R.id.businessname);
            OwnerName  = itemView.findViewById(R.id.ownername);
            DateOfJoining = itemView.findViewById(R.id.dateofjoin);
        }
    }
}
