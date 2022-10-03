package com.agalobr.aad_2022.ut01.ex03.data

import android.content.SharedPreferences
import com.agalobr.aad_2022.ut01.ex03.domain.News
import com.google.gson.Gson

class NewsLocalSource (val sharedPref: SharedPreferences) {

    fun setNews(news: News){

        val gson = Gson()
        val jsonNews = gson.toJson(news, News::class.java)


        val edit = sharedPref.edit()
            edit.putString(news.id.toString(), jsonNews )
            edit.apply()

    }
    fun findById(newsId: Int): News{
        val gson = Gson()

        val jsonNews = sharedPref.getString(newsId.toString(),"")

        return gson.fromJson(jsonNews, News::class.java)

    }
    fun setNewsList(newsList:MutableList<News>){
        newsList.forEach(

        )
    }
    fun findAll() : MutableList<News>{
        //Buscar y devolver todas las noticias
        return mutableListOf()
    }
}