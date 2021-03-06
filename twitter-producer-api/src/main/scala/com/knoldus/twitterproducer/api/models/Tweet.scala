package com.knoldus.twitterproducer.api.models

import play.api.libs.json.Json

/**
  * Created by Knoldus on 16/2/17.
  */
case class Tweet(
                  tweetId: Long,
                  createdAt: Long,
                  userId: Long,
                  tweetUserName: String,
                  text: String,
                  friendsCount: Long
                )

object Tweet {
  implicit val tweetFormatter = Json.format[Tweet]
}
