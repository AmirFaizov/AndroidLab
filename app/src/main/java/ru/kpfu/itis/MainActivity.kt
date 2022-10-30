package ru.kpfu.itis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.kpfu.itis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportFragmentManager.beginTransaction()
            .add(
                R.id.container,
                MainFragment.newInstance(Bundle()),
                MainFragment.MAIN_FRAGMENT_TAG
            ).commit()
    }


}
