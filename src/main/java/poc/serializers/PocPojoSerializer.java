package poc.serializers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import poc.PocPojo;

public class PocPojoSerializer extends StdSerializer<PocPojo>{

    protected PocPojoSerializer(Class<PocPojo> clazz) {super(clazz);}

    public PocPojoSerializer() {this(null);}

    private static final long serialVersionUID = 7534114107525645491L;

    @Override
    public void serialize(PocPojo poc, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeNumberField("monetaryAmount", poc.monetaryAmount.getNumber().doubleValue());
        gen.writeStringField("localDate", poc.localDate.toString());
        gen.writeStringField("firstName", poc.anotherPojo.forename);
        gen.writeStringField("lastName", poc.anotherPojo.surname);
        gen.writeEndObject();
    }

}
