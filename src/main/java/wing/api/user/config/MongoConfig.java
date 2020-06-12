package wing.api.user.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
// mongo를 사용하지 않으므로 안쓰는 코드
/*
@Configuration
@RequiredArgsConstructor
public class MongoConfig{
    private final MongoDbFactory mongoDbFactory;
    private final MongoMappingContext mongoMappingContext;

    @Bean
    public MappingMongoConverter mappingMongoConverter(){
        DbRefResolver dbRefResolver = new DefaultDbRefResolver(mongoDbFactory);
        MappingMongoConverter converter = new MappingMongoConverter(dbRefResolver, mongoMappingContext);
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return converter;
    }
    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoDbFactory, mappingMongoConverter());
    }
}*/