package mx.tecnm.ladm_u1_ejercicio8_mensajestimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import mx.tecnm.ladm_u1_ejercicio8_mensajestimer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var vectorFraces = arrayOf("Frase 1: \nEl conocimiento es poder.",
        "Frase 2: \nHonor a quien honor merece.",
        "Frase 3: \n#NoMeRepruebesBenigno :(",
        "Frase 4: \nI love mi Cabecita de algodon",
        "Frase 5: \nEl tec es la mejor universidas \nSe tenia que decir y se dijo",
        "Frase 6: \nEl sanguis de salchicha es mejor que el de jamon \npero no estas listo para esa conversacion",
        "Frase 7: \nEl huavito si puede llevar catsum y está bien",
        "Frase 8: \nDios nos cuide de rusia y su cochinero")
    var contador = 0
    val  timer = object : CountDownTimer(24000,3000) {
        override fun onTick(p0: Long) {
            binding.lblFraces.setText(vectorFraces[contador])
            contador++
            if (contador>vectorFraces.size-1) contador=0
        }

        override fun onFinish() {
            start()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        binding.btnIniciar.setOnClickListener {
            timer.start()
        }
        setContentView(binding.root)
    }
}