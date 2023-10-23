package com.involveininnovation.chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").setAllowedOriginPatterns("*").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableSimpleBroker("/chatroom","/user");
        registry.setUserDestinationPrefix("/user");
    }
}

/*
Ky kod është një konfigurim i mënyrës se si implementohen dhe menaxhohen WebSocket në një aplikacion përmes bibliotekës Spring Framework.

1. `package com.involveininnovation.chat.config;`: Ky është një deklaratë për paketën (package) ku është vendosur klasa e kodit.

2. `import` linjat: Këto linja importojnë ndryshuesit (libraries) nga Spring Framework dhe Spring
 WebSocket për të përdorur klasat dhe funksionet që ofrohen nga ato për implementimin e WebSocket.

3. `@Configuration`: Kjo është një etiketë (annotation) që tregon se klasa është një konfigurim i Spring.

4. `@EnableWebSocketMessageBroker`: Kjo etiketë tregon që klasa përdor WebSocket për komunikim dhe dërgim të mesazheve.

5. `WebSocketConfig implements WebSocketMessageBrokerConfigurer`: Kjo është klasa e konfigurimit që
implementon një sërë metodash nga `WebSocketMessageBrokerConfigurer` për të konfiguruar WebSocket.

6. `registerStompEndpoints`: Kjo metodë regjistron endpoints (pikat e hyrjes) për komunikim përmes protokollit
Stomp (Simple Text Oriented Messaging Protocol). Në këtë rast, një endpoint është krijuar
në adresën "/ws" dhe është lejuar origjina ("allowed origin") e çfarëdo origjineje
 me përdorimin e `setAllowedOriginPatterns("*")`. Po ashtu, është përdorur SockJS për të
 siguruar kompatibilitet nëse WebSocket nuk është i disponueshëm.

7. `configureMessageBroker`: Ky metodë konfiguron mesazhëbërësin (message broker) për të
 drejtuar mesazhet në destinacione të ndryshme. `setApplicationDestinationPrefixes("/app")` tregon se çdo kërkesë me prefix "/app" do të
  drejtohet te aplikacioni. `enableSimpleBroker("/chatroom","/user")` konfiguron një mesazhëbërës të thjeshtë që do të ndajë mesazhet në dy
  kategori: "/chatroom" dhe "/user". `setUserDestinationPrefix("/user")` tregon se destinacionet e mesazheve të përdoruesve do
   të kenë prefix "/user".

Përmbledhtazi, ky kod implementon dhe konfiguron një sistemit të komunikimit WebSocket me përdorimin e Spring Framework.
Ka një endpoint të hyrjes në "/ws" për të lidhur klientët përmes WebSocket dhe konfiguron mesazhëbërësin për të drejtuar mesazhet në
 destinacione të ndryshme.
 */