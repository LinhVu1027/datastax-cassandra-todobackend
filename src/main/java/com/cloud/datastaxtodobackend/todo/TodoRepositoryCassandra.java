package com.cloud.datastaxtodobackend.todo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TodoRepositoryCassandra extends CassandraRepository<TodoEntity, UUID> {

}

//@Repository
//public class TodoRepositorySimpleCassandra
//        extends SimpleCassandraRepository<TodoEntity, UUID> {
//
//    protected final CqlSession          cqlSession;
//    protected final CassandraOperations cassandraTemplate;
//
//    public TodoRepositorySimpleCassandra(CqlSession cqlSession, CassandraOperations ops) {
//        super(
//                new MappingCassandraEntityInformation<TodoEntity, UUID>(
//                        (CassandraPersistentEntity<TodoEntity>)
//                                ops.getConverter()
//                                        .getMappingContext()
//                                        .getRequiredPersistentEntity(TodoEntity.class),
//                        ops.getConverter()), ops);
//        this.cqlSession = cqlSession;
//        this.cassandraTemplate = ops;
//    }
