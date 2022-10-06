package com.agalobr.aad_2022.ut01.ex03.data

import android.content.SharedPreferences
import com.agalobr.aad_2022.ut01.ex03.domain.News
import com.google.gson.Gson
import java.lang.reflect.Type
import com.google.gson.reflect.TypeToken

class NewsLocalSource (val sharedPref: SharedPreferences) {

    private val gson = Gson()

    fun setNews(news: News){

        val jsonNews = gson.toJson(news, News::class.java)

<<<<<<< HEAD
=======

>>>>>>> origin/master
        val edit = sharedPref.edit()
            edit.putString(news.id.toString(), jsonNews)
            edit.apply()

    }
    fun findById(newsId: Int): News{

        val jsonNews = sharedPref.getString(newsId.toString(),"")

        return gson.fromJson(jsonNews, News::class.java)

    }
    fun setNewsList(newsList:MutableList<News>){
        val jsonNews = gson.toJson(newsList)
        val edit = sharedPref.edit()
        edit.putString("ALL", jsonNews)
        edit.apply()
    }
<<<<<<< HEAD

    fun setNewsListV2(newsList: MutableList<News>) {
        val jsonNews = gson.toJson(newsList)
        val edit = sharedPref.edit()
        edit.putString("ALL", jsonNews)
        edit.apply()
    }

=======
>>>>>>> origin/master
    fun findAll() : MutableList<News> {
        //Buscar y devolver todas las noticias
        val newsList = mutableListOf<News>()
        sharedPref.all.forEach { entry ->
            val news = gson.fromJson(entry.value as String, News::class.java)
            newsList.add(news)
<<<<<<< HEAD
        }
        return newsList
=======
            return mutableListOf()
        }
>>>>>>> origin/master
    }

    fun findAllV2(): MutableList<News> {
        val jsonNews = sharedPref.getString("ALL", "")

        val typeNews: Type = object : TypeToken<MutableList<News>>() {}.type
        return gson.fromJson(jsonNews, typeNews)
    }

    fun findAllKotlin() = sharedPref.all.map { entry ->
        gson.fromJson(entry.value as String, News::class.java)
    }.toMutableList()
}