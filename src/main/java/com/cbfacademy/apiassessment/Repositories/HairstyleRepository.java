//* 
package com.cbfacademy.apiassessment.Repositories;

import java.io.IOException;

import com.cbfacademy.apiassessment.core.Hair.Hairstyle;

// import java.io.Serializable;
// import java.util.List;

public interface HairstyleRepository {
    Hairstyle getAllHairstyles() throws IOException;

    Hairstyle getHairstyleByName(String name) throws IOException;

    void createHairstyle(Hairstyle hairstyle) throws IOException;

    void updatedHairstyle(Hairstyle hairstyle) throws IOException;

    void deleteHairstyle(Hairstyle hairstyle) throws IOException;
}
