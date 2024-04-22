package org.example

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types._

object SparkDemo {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[*]").appName("Spark_Scala_Demo").getOrCreate()

    println("Printing the spark Session variables")
    println("Spark Appname : "+spark.sparkContext.appName)
    println("Spark Master : "+spark.sparkContext.master)

    val schema = StructType(Array(
      StructField("TimeStamp", StringType, true),
      StructField("Animal", StringType, true)
    ))

    val df = spark.read.option("header", false).option("delimiter", ",").schema(schema)
      .csv("src/main/resources/data/sample_data.csv")

    df.printSchema()
    df.show()

    spark.stop()
  }
}