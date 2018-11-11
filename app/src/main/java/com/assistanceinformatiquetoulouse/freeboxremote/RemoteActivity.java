package com.assistanceinformatiquetoulouse.freeboxremote;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class RemoteActivity extends AppCompatActivity {
    // Attributs prives
    Context pContext;
    private ImageButton pImageButtonMute;
    private Button pButtonFree;
    private ImageButton pImageButtonPower;
    private Button pButton1;
    private Button pButton2;
    private Button pButton3;
    private Button pButton4;
    private Button pButton5;
    private Button pButton6;
    private Button pButton7;
    private Button pButton8;
    private Button pButton9;
    private Button pButton0;
    private ImageButton pImageButtonBack;
    private ImageButton pImageButtonUp;
    private ImageButton pImageButtonSearch;
    private ImageButton pImageButtonLeft;
    private Button pButtonOK;
    private ImageButton pImageButtonRight;
    private ImageButton pImageButtonMenu;
    private ImageButton pImageButtonDown;
    private ImageButton pImageButtonInfo;
    private Button pButtonVolInc;
    private Button pButtonProgInc;
    private Button pButtonVolDec;
    private Button pButtonProgDec;
    private ImageButton pImageButtonRecord;
    private ImageButton pImageButtonRewind;
    private ImageButton pImageButtonPlay;
    private ImageButton pImageButtonForward;
    String pCode;

    // Méthode setImageButtonSize
    private void setImageButtonSize(ImageButton a_image_button, int a_size) {
        if (a_image_button.getLayoutParams().getClass() == RelativeLayout.LayoutParams.class) {
            RelativeLayout.LayoutParams lLayoutParams = (RelativeLayout.LayoutParams) a_image_button.getLayoutParams();
            lLayoutParams.height = a_size;
            lLayoutParams.width = a_size;
            a_image_button.setLayoutParams(lLayoutParams);
            a_image_button.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        else {
            LinearLayout.LayoutParams lLayoutParams = (LinearLayout.LayoutParams) a_image_button.getLayoutParams();;
            lLayoutParams.height = a_size;
            lLayoutParams.width = a_size;
            a_image_button.setLayoutParams(lLayoutParams);
            a_image_button.setScaleType(ImageView.ScaleType.FIT_XY);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pContext = this;
        setContentView(R.layout.activity_remote);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pImageButtonMute = (ImageButton) findViewById(R.id.imageButtonMute);
        setImageButtonSize(pImageButtonMute, getResources().getDimensionPixelSize(R.dimen.size_image_button_arrow));
        pButtonFree = (Button) findViewById(R.id.buttonFree);
        pImageButtonPower = (ImageButton) findViewById(R.id.imageButtonPower);
        setImageButtonSize(pImageButtonPower, getResources().getDimensionPixelSize(R.dimen.size_image_button_arrow));
        pButton1 = (Button) findViewById(R.id.button1);
        pButton2 = (Button) findViewById(R.id.button2);
        pButton3 = (Button) findViewById(R.id.button3);
        pButton4 = (Button) findViewById(R.id.button4);
        pButton5 = (Button) findViewById(R.id.button5);
        pButton6 = (Button) findViewById(R.id.button6);
        pButton7 = (Button) findViewById(R.id.button7);
        pButton8 = (Button) findViewById(R.id.button8);
        pButton9 = (Button) findViewById(R.id.button9);
        pButton0 = (Button) findViewById(R.id.button0);
        pImageButtonBack = (ImageButton) findViewById(R.id.imageButtonB);
        setImageButtonSize(pImageButtonBack, getResources().getDimensionPixelSize(R.dimen.size_image_button_arrow));
        pImageButtonUp = (ImageButton) findViewById(R.id.imageButtonUp);
        setImageButtonSize(pImageButtonUp, getResources().getDimensionPixelSize(R.dimen.size_image_button_arrow));
        pImageButtonSearch = (ImageButton) findViewById(R.id.imageButtonS);
        setImageButtonSize(pImageButtonSearch, getResources().getDimensionPixelSize(R.dimen.size_image_button_arrow));
        pImageButtonLeft = (ImageButton) findViewById(R.id.imageButtonLeft);
        setImageButtonSize(pImageButtonLeft, getResources().getDimensionPixelSize(R.dimen.size_image_button_arrow));
        pButtonOK = (Button) findViewById(R.id.buttonOK);
        pImageButtonRight = (ImageButton) findViewById(R.id.imageButtonRight);
        setImageButtonSize(pImageButtonRight, getResources().getDimensionPixelSize(R.dimen.size_image_button_arrow));
        pImageButtonMenu = (ImageButton) findViewById(R.id.imageButtonM);
        setImageButtonSize(pImageButtonMenu, getResources().getDimensionPixelSize(R.dimen.size_image_button_arrow));
        pImageButtonDown = (ImageButton) findViewById(R.id.imageButtonDown);
        setImageButtonSize(pImageButtonDown, getResources().getDimensionPixelSize(R.dimen.size_image_button_arrow));
        pImageButtonInfo = (ImageButton) findViewById(R.id.imageButtonI);
        setImageButtonSize(pImageButtonInfo, getResources().getDimensionPixelSize(R.dimen.size_image_button_arrow));
        pButtonVolInc = (Button) findViewById(R.id.buttonVolInc);
        pButtonProgInc = (Button) findViewById(R.id.buttonProgInc);
        pButtonVolDec = (Button) findViewById(R.id.buttonVolDec);
        pImageButtonRecord = (ImageButton) findViewById(R.id.imageButtonRecord);
        setImageButtonSize(pImageButtonRecord, getResources().getDimensionPixelSize(R.dimen.size_button));
        pButtonProgDec = (Button) findViewById(R.id.buttonProgDec);
        pImageButtonRewind = (ImageButton) findViewById(R.id.imageButtonRewind);
        setImageButtonSize(pImageButtonRewind, getResources().getDimensionPixelSize(R.dimen.size_button));
        pImageButtonPlay = (ImageButton) findViewById(R.id.imageButtonPlay);
        setImageButtonSize(pImageButtonPlay, getResources().getDimensionPixelSize(R.dimen.size_button));
        pImageButtonForward = (ImageButton) findViewById(R.id.imageButtonForward);
        setImageButtonSize(pImageButtonForward, getResources().getDimensionPixelSize(R.dimen.size_button));
        pCode = getString(R.string.default_code);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater lLayoutInflater = LayoutInflater.from(pContext);
                View lView = lLayoutInflater.inflate(R.layout.code_remote, null);
                AlertDialog.Builder lAlertDialogBuilder = new AlertDialog.Builder(pContext);
                lAlertDialogBuilder.setView(lView);
                final EditText lEditText = lView.findViewById(R.id.editTextCode);
                lEditText.setHint(pCode);
                lAlertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                pCode = lEditText.toString();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog lAlertDialog = lAlertDialogBuilder.create();
                lAlertDialog.show();
                // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
            }
        });
        pImageButtonMute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "mute", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButtonFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "home", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "power", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "1", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "2", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "3", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "4", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "5", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "6", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "7", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "8", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "9", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "0", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "back", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "up", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "swap", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "left", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButtonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "ok", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "right", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "menu", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "down", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "info", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButtonVolInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "vol_inc", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButtonProgInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "prgm_inc", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButtonVolDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "vol_dec", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "rec", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pButtonProgDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "prgm_dec", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "bwd", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonRewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "play", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
        pImageButtonForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lURL = String.format(getString(R.string.URL), "fwd", pCode);
                DownloadTask downloadTask = new DownloadTask(getApplicationContext());
                downloadTask.execute(lURL);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_remote, menu);
        return(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            AlertDialog.Builder lAlertDialog = new AlertDialog.Builder(this);
            lAlertDialog.setTitle("Télécommande Freebox\nVersion " + this.getString(R.string.version));
            lAlertDialog.setMessage("© AIT 2018 (pascalh)\n\nassistanceinformatiquetoulouse@gmail.com");
            lAlertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                }});
            lAlertDialog.setIcon(R.mipmap.ic_freeboxremote);
            lAlertDialog.create().show();
            return(true);
        }
        else {
        }
        return(super.onOptionsItemSelected(item));
    }
}