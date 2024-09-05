package com.example.feature_vacancies.domain

import com.example.core_network.dtoi.OffersDTOI
import com.example.core_network.dtoi.VacancyDTOI
import com.example.feature_vacancies.domain.models.OfferModel
import com.example.feature_vacancies.domain.models.VacancyModel

object Mapper {

    fun VacancyDTOI.mapToData(): VacancyModel =
        VacancyModel(
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
            schedules = schedules,
            publishedDate = publishedDate,
            isFavorite = isFavorite,
            appliedNumber = appliedNumber,
            description = description,
            responsibilities = responsibilities,
            questions = questions
        )

    fun OffersDTOI.mapToData(): OfferModel =
        OfferModel(
            id = id,
            textButton = button?.text,
            title = title,
            link = link
        )
}