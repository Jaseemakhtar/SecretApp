package com.jsync.sapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SecretCodeReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Received secret Code", Toast.LENGTH_SHORT).show()
        val intent = Intent(context, MainActivity::class.java)
        intent.putExtra(MainActivity.STARTED_WITH_SEC_CODE, 1)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context?.startActivity(intent)
    }
}