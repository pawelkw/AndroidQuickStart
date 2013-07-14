package app.template.dialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import org.holoeverywhere.LayoutInflater;
import org.holoeverywhere.app.AlertDialog;
import org.holoeverywhere.app.Dialog;
import org.holoeverywhere.app.DialogFragment;

import app.template.R;

public class AboutDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                getSupportActivity());
        alertDialogBuilder.setTitle(R.string.about);
        alertDialogBuilder.setView(LayoutInflater.from(getSupportActivity()).inflate(
                R.layout.dialog_about, null));
        alertDialogBuilder.setPositiveButton(R.string.contact_me,
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent emailIntent = new Intent(
                                android.content.Intent.ACTION_SEND);
                        emailIntent.putExtra(
                                android.content.Intent.EXTRA_EMAIL,
                                new String[]{getString(R.string.dev_email)});
                        emailIntent.putExtra(
                                android.content.Intent.EXTRA_SUBJECT,
                                getString(R.string.app_name));
                        emailIntent.setType("plain/text");
                        startActivity(Intent.createChooser(emailIntent,
                                getString(R.string.send_email_using_)));
                    }
                });
        return alertDialogBuilder.create();
    }
}