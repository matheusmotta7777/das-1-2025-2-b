package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

public class Publisher {
    public static void main(String[] args) {
        var topicName = "topic-das1-b";
        var servidor = "sbdas12025a.servicebus.windows.net";

        String chave = System.getenv("CHAVE");

        // DefaultAzureCredential credential = 
        //     new DefaultAzureCredentialBuilder().build(); //recupera a credencial

        ServiceBusSenderClient senderClient = 
            new ServiceBusClientBuilder()
            .fullyQualifiedNamespace(servidor)
            .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
            // .credential(credential)
            .connectionString(chave)        //fazer dessa forma para não vazar a chave
            .sender()
            .topicName(topicName)
            .buildClient();

        senderClient.sendMessage(
            new ServiceBusMessage(
                "Opa de maça verde é mt bom"));
    }

}
