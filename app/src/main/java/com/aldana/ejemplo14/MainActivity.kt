package com.aldana.ejemplo14

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.aldana.ejemplo14.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var scoreViewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.scores = ScoreData(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)

        /*displayScore(
            tv_score_team_a,
            scoreViewModel.scoreTeamA
        )

        displayScore(
            tv_score_team_b,
            scoreViewModel.scoreTeamB
        )

        // TODO: El ViewModel es restaurado si ya existía, si no, se crea uno nuevo.
        // TODO: Recuerde que el ViewModel solo sobrevive a cambios de configuración y no a la destrucción de la aplicación
        */
    }


    // TODO: Accediendo y modificando datos almacenados en el ViewModel según el método utilizado

    fun addOneTeamA(v: View) {
        scoreViewModel.scoreTeamA+=1;
        binding.scores = ScoreData(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
    }

    fun addOneTeamB(v: View) {
        scoreViewModel.scoreTeamB+=1
        binding.scores = ScoreData(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
    }

    fun addTwoTeamA(v: View) {
        scoreViewModel.scoreTeamA += 2
        binding.scores = ScoreData(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
    }

    fun addTwoTeamB(v: View) {
        scoreViewModel.scoreTeamB += 2
        binding.scores = ScoreData(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
    }

    fun addThreeTeamA(v: View) {
        scoreViewModel.scoreTeamA += 3
        binding.scores = ScoreData(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
    }

    fun addThreeTeamB(v: View) {
        scoreViewModel.scoreTeamB += 3
        binding.scores = ScoreData(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
    }

    fun resetScores(v: View) {
        scoreViewModel.scoreTeamA = 0
        scoreViewModel.scoreTeamB = 0
        binding.scores = ScoreData(scoreViewModel.scoreTeamA, scoreViewModel.scoreTeamB)
    } // TODO: Limpiando datos


}
