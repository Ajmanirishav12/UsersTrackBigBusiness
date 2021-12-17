package com.example.userstrackbigbusiness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.userstrackbigbusiness.UserDetails.User;

public class UserCardDetails extends AppCompatActivity {
      TextView ownerName,userPhoneno,emailAddress,addressLine,EmployeeDetails,businessType,upiId;
      User details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
        details = (User)getIntent().getSerializableExtra("User Details");
        }
        setContentView(R.layout.activity_user_card_details);
        ownerName = findViewById(R.id.ownernamedetails);
        userPhoneno = findViewById(R.id.userphonenodetails);
        emailAddress = findViewById(R.id.useremaildetails);
        addressLine = findViewById(R.id.useraddress1details);
        businessType = findViewById(R.id.userbusinesstype);
        upiId = findViewById(R.id.upidid);
        ownerName.setText(details.getName());
        userPhoneno.setText(details.getPhoneNumber());
        if(details.getEmailId()==null)
            emailAddress.setText("No EmailId Added");
        else
        emailAddress.setText(details.getEmailId());
        if(details.getUpId()==null)
            upiId.setText("No Upi Added");
        else
        upiId.setText(details.getUpId());

        if(details.getBusinessType()==null)
            businessType.setText("No Business Type added");
        else
        businessType.setText(details.getBusinessType());

        if(details.getBusinessAddressLine1()==null)
            addressLine.setText("No AddressLine Added");
        else
        addressLine.setText(details.getBusinessAddressLine1());
    }
}