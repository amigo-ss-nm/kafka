package com.qingruan.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;

import java.util.Properties;

/*
*测试Kafka生产者
* */
public class TestProducer {
    public static void main(String[] args) {
        Properties properties=new Properties();

        //定义kafka的消息生产者
        KafkaProducer<String,String> producer=new KafkaProducer<String, String>(properties);

    }
}
