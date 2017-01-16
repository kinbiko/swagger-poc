package poc;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import poc.serializers.PocPojoSerializer;

@Configuration
public class JacksonConfig {

    @Autowired
    private ObjectMapper objectMapper;

    @PostConstruct
    public void configureMapper() {
        SimpleModule module = new SimpleModule();
        module.addSerializer(PocPojo.class, new PocPojoSerializer());
        objectMapper.registerModule(module);
        objectMapper.findAndRegisterModules();
    }
}
