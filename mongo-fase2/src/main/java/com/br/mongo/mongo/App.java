package com.br.mongo.mongo;

import model.Vacinacao;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;



import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.function.Consumer;



import static com.mongodb.client.model.Updates.set;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;


public class App {
    public static void main( String[] args )    {
       CodecRegistry projoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
    		   fromProviders(PojoCodecProvider.builder().automatic(true).build()));
       
       MongoClient mongoClient = new MongoClient("localhost:27017 ",
    		   MongoClientOptions.builder().codecRegistry(projoCodecRegistry).build());
       
       MongoDatabase database = mongoClient.getDatabase("exemplo")
    		   .withCodecRegistry(projoCodecRegistry);
       
       MongoCollection<Vacinacao> collection = database.getCollection("Vacinacao",Vacinacao.class);
       
      collection.insertOne(new Vacinacao(1,63452,"Recebidas"));
      collection.insertOne(new Vacinacao(2,59062,"Aplicadas"));
      // collection.updateOne(new Document("_id",1), set("doses",50000));
      // collection.updateOne(new Document("_id",2), set("doses",50000));
       //collection.deleteOne(new Document("vacinas","Recebidas"));
     //collection.deleteOne(new Document("vacinas","Aplicadas"));
       
   	
	
    
    }
}
