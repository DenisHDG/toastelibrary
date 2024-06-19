package br.poscontrole.toastelibrary

import android.content.Context
import android.widget.Toast

class Toaste {
    fun testeToast(context: Context){
        Toast.makeText(context, "Deu Bom! Parabêns você é um otimo programador!", Toast.LENGTH_LONG).show()
    }
}