package com.example.feauture_auth.view.first_auth.domain

import com.example.core_database.entity.OfferEntity
import com.example.core_database.entity.VacancyEntity
import com.example.core_network.dtoi.OffersDTOI
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
            fullSalary = salary.full,
            shortSalary = salary.short,
            schedules = schedules.joinToString(),
            publishedDate = publishedDate,
            isFavorite = isFavorite,
            appliedNumber = appliedNumber,
            description = description,
            responsibilities = responsibilities,
            questions = questions.joinToString()
        )

    fun OffersDTOI.mapToEntity(i: Int): OfferEntity =
        OfferEntity(
            externalId = i,
            id = id,
            textButton = button?.text,
            title = title,
            link = link
        )
}