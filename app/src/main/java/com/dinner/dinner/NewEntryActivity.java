package com.dinner.dinner;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class NewEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_entry);
        setTitle(getResources().getString(R.string.new_entry_lable));


        Button newEntryBtn = findViewById(R.id.btn_create);
        final CheckBox soupCB = findViewById(R.id.checkSoup);
        final CheckBox saladCB = findViewById(R.id.checkSalad);
        final CheckBox mainCB = findViewById(R.id.checkMain);
        final RadioGroup deliveryRG = findViewById(R.id.new_entry_dinner_delivery_group);
        final EditText priceET = findViewById(R.id.new_entry_dinner_price);
        final Spinner paymentSpin = findViewById(R.id.payment);

        newEntryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dinnerTypes = "";
                if (soupCB.isChecked()) {
                    dinnerTypes = dinnerTypes + soupCB.getText().toString() + " ";
                }
                if (saladCB.isChecked()) {
                    dinnerTypes = dinnerTypes + saladCB.getText().toString() + " ";
                }
                if (mainCB.isChecked()) {
                    dinnerTypes = dinnerTypes + mainCB.getText().toString() + " ";
                }

                int selectedDeliveryType = deliveryRG.getCheckedRadioButtonId();
                RadioButton deliveryType = findViewById(selectedDeliveryType);
                String selectedDeliveryTypeBtnName = deliveryType.getText().toString();

                double price = Double.parseDouble(priceET.getText().toString());

                String payment = String.valueOf(paymentSpin.getSelectedItem());

                Dinner dinner = new Dinner(dinnerTypes, selectedDeliveryTypeBtnName, price, payment);

                Toast.makeText(NewEntryActivity.this,
                        "Dinner type: " + dinner.getDinnerType() + "\n" +
                                "Delivery type: " + dinner.getDelivery() + "\n" +
                                "Price: " + dinner.getPrice() + "\n" +
                                "Payment: " + dinner.getPayment() + "\n",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }


}