package com.example.userstrackbigbusiness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.userstrackbigbusiness.UserDetails.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference,employee;
    int userCount,employeeCount;
    List<User> UserDetails;
    RecyclerView userlist;
    TextView UserCount,EmployeeCount;
  //  ActivityMainBinding activityMainBinding;
    TextView userEditText,employeeEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserDetails = new ArrayList<>();
        userEditText = findViewById(R.id.usercount);
        employeeEditText = findViewById(R.id.noofemployees);
        userlist = findViewById(R.id.userdetailsrecycler);
        reference = FirebaseDatabase.getInstance().getReference("Users");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
               for(DataSnapshot dataSnapshot:snapshot.getChildren()) {
                   userCount++;
                   User userProfile = dataSnapshot.child("Profile").getValue(User.class);
                   if(userProfile!=null) {
                       UserDetails.add(userProfile);
                   }
                   DataSnapshot EmpCount = dataSnapshot.child("Staff-Management");
                   if (EmpCount != null) {
                       userProfile.setEmployeeCount((int)EmpCount.getChildrenCount());
                       employeeCount = (int) (employeeCount + EmpCount.getChildrenCount());
                   }
               }
                userEditText.setText(Integer.toString(userCount));
               employeeEditText.setText(Integer.toString(employeeCount));
                UserDetailsAdapter adapter = new UserDetailsAdapter(MainActivity.this,UserDetails);
                userlist.setAdapter(adapter);
                LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
                userlist.setLayoutManager(layoutManager);

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}