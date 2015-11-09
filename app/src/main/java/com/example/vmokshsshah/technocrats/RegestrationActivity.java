package com.example.vmokshsshah.technocrats;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.vmokshsshah.technocrats.navigationdrawer.NavigationDrawer;

public class RegestrationActivity extends Activity {

	
	EditText et_name,et_mono,et_sec_name,et_thr_name,et_four_name,et_add,et_clgname,et_email;
	Button btn_submit;
	CheckBox cb_accept;
	Spinner sp_course,sp_stu_no;
	TextView tv_fee,tv_grp_title;

    AlertDialog.Builder builder;
	
	
	String course,stu_count;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_form);


        et_name = (EditText) this.findViewById(R.id.et_name);
        et_mono = (EditText) this.findViewById(R.id.et_mo_no);
        et_sec_name = (EditText) this.findViewById(R.id.et_stu_two);
        et_thr_name = (EditText) this.findViewById(R.id.et_stu_three);
        et_four_name = (EditText) this.findViewById(R.id.et_stu_four);
        et_add = (EditText) this.findViewById(R.id.et_add);
        et_clgname = (EditText) this.findViewById(R.id.et_college);
        et_email = (EditText) this.findViewById(R.id.et_email);


        sp_course = (Spinner) this.findViewById(R.id.sp_course);
        sp_stu_no = (Spinner) this.findViewById(R.id.sp_stu_no);

        cb_accept = (CheckBox) this.findViewById(R.id.cb_accept);
        btn_submit = (Button) this.findViewById(R.id.btn_submit);
        tv_fee = (TextView) this.findViewById(R.id.tv_fee);
        tv_grp_title = (TextView) this.findViewById(R.id.sp_grp_title);
        Spinner s = (Spinner) findViewById(R.id.sp_course);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(RegestrationActivity.this,
                R.layout.spinner_item,
                getResources().getStringArray(R.array.formtype));
        s.setAdapter(adapter);


        sp_course.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // TODO Auto-generated method stub

                course = parent.getItemAtPosition(position).toString();

                if (course.equals("Android Project training")) {

                    sp_stu_no.setVisibility(View.VISIBLE);
                    tv_grp_title.setVisibility(View.VISIBLE);

                } else if (course.equals("Personality Development")) {

                    stu_count = "1";
                    sp_stu_no.setVisibility(View.GONE);
                    et_sec_name.setVisibility(View.GONE);
                    et_thr_name.setVisibility(View.GONE);
                    et_four_name.setVisibility(View.GONE);
                    tv_grp_title.setVisibility(View.GONE);

                    tv_fee.setText("Fee Amount: Rs.2000/Student.");

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });


        s = (Spinner) findViewById(R.id.sp_stu_no);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(RegestrationActivity.this,
                R.layout.spinner_group,
                getResources().getStringArray(R.array.student_no));
        s.setAdapter(ad);


        sp_stu_no.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // TODO Auto-generated method stub

                stu_count = parent.getItemAtPosition(position).toString();

                if (stu_count.equals("1")) {

                    et_sec_name.setVisibility(View.GONE);
                    et_thr_name.setVisibility(View.GONE);
                    et_four_name.setVisibility(View.GONE);

                    tv_fee.setText("Fee Amount: Rs.15,000.");

                } else if (stu_count.equals("2")) {

                    et_sec_name.setVisibility(View.VISIBLE);
                    et_thr_name.setVisibility(View.GONE);
                    et_four_name.setVisibility(View.GONE);

                    tv_fee.setText("Fee Amount: Rs.14,500/Student.");
                } else if (stu_count.equals("3")) {

                    et_sec_name.setVisibility(View.VISIBLE);
                    et_thr_name.setVisibility(View.VISIBLE);
                    et_four_name.setVisibility(View.GONE);


                    tv_fee.setText("Fee Amount: Rs.14,000/Student.");

                } else if (stu_count.equals("4")) {

                    et_sec_name.setVisibility(View.VISIBLE);
                    et_thr_name.setVisibility(View.VISIBLE);
                    et_four_name.setVisibility(View.VISIBLE);


                    tv_fee.setText("Fee Amount: Rs.13,500/Student.");


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });


        cb_accept.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // TODO Auto-generated method stub


                if (cb_accept.isChecked()) {

                    btn_submit.setEnabled(true);

                } else {

                    btn_submit.setEnabled(false);
                    ;

                }


            }
        });

        builder = new AlertDialog.Builder(this);


        btn_submit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if (et_name.getText().toString().length() == 0) {
                    et_name.setError("Enter Your Name Here!!!!");
                    return;
                } else if (et_mono.getText().toString().length() == 0 || et_mono.getText().toString().length() < 10) {
                    et_mono.setError("Enter Mobile No.Please!!!!!");
                    return;
                } else if (stu_count.equals("2")) {
                    if (et_sec_name.getText().toString().length() == 0) {
                        et_sec_name.setError("Enter 2nd Partner name.Please!!!!!");
                        return;
                    }
                } else if (stu_count.equals("3")) {
                    if (et_thr_name.getText().toString().length() == 0) {

                        et_thr_name.setError("Enter 3rd Partner name.Please!!!!!");
                        return;
                    }
                } else if (stu_count.equals("4")) {
                    if (et_four_name.getText().toString().length() == 0) {

                        et_four_name.setError("Enter 4th Partner name.Please!!!!!");
                        return;
                    }
                } else if (!et_email.getText().toString().matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]" +
                        "+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$") || et_email.getText().length() == 0) {
                    et_email.setError("Enter Email Address!!!!!");
                    return;
                    //Toast.makeText(Registration.this,"Valid Email Addresss", Toast.LENGTH_SHORT).show();
                } else if (et_add.getText().toString().length() == 0) {
                    et_add.setError("Enter Your Res.Add Here!!!!");
                    return;
                } else if (et_clgname.getText().toString().length() == 0) {
                    et_clgname.setError("Enter Your college Name Here!!!!");
                    return;
                }

                new gmail().execute();

            }
        });
    }

         class gmail extends AsyncTask<Object, Void, String> {
            private final static String TAG = "LoginActivity";
            protected ProgressDialog progressDialog;



            @Override
            protected String doInBackground(Object... params) {
                return null;
            }

            @Override
        protected void onPreExecute()
        {


            //System.out.println("On PRe Execute----done-------");
            super.onPreExecute();
             Log.d(TAG, "Login");

            progressDialog = ProgressDialog.show(RegestrationActivity.this, "Loading", "Please Wait--------.", true, false);
        }




        @Override
        protected void onPostExecute(String result) {

            System.out.println("OnpostExecute----done-------");
            super.onPostExecute(result);


            Log.d(TAG, "Login passou persistindo info de login local no device");

            progressDialog.dismiss();

            builder.setIcon(R.drawable.ic_launcher)
                    .setTitle("---Thank You---")
                    .setMessage("Your Registration Done." + "\nWe will call you within 24Hr for Verification.")
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            Intent feedbackform = new Intent(RegestrationActivity.this, NavigationDrawer.class);
                            startActivity(feedbackform);

                            finish();
// 							Count++;


                        }
                    });


            builder.setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                    System.exit(0);
                }
            });

 			/*
 			       builder.setNeutralButton(" No  ", new DialogInterface.OnClickListener() {
 			    	   		public void onClick(DialogInterface dialog, int id) {


                     dialog.cancel();

                 }
             });
*/


            AlertDialog alert = builder.create();
            alert.show();


        }



        }



}
