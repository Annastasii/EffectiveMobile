package com.example.data.mapper

import com.example.core_database.entity.VacancyEntity
import com.example.core_network.dtoi.VacancyDTOI

object Mapper {

    fun VacancyDTOI.mapToEntity(): VacancyEntity =
        VacancyEntity(
            id = id,
            lookingNumber = lookingNumber,
            title = title,
            town = address.town,
            street = address.street,
            house = address.house,
            company = company,
            previewTextExperience = experience.previewText,
            textExperience = experience.text,
            publishedDate = publishedDate,
            isFavorite = isFavorite,
            fullSalary = salary.full,
            shortSalary = salary.short,
            schedules = schedules,
            appliedNumber = appliedNumber,
            description = description,
            responsibilities = responsibilities,
            questions = questions
        )
}