package com.example.feature_vacancies.domain

import com.example.core_database.entity.OfferEntity
import com.example.core_database.entity.VacancyEntity
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

    fun VacancyEntity.mapToModel(): VacancyModel =
        VacancyModel(
            id = id,
            lookingNumber = lookingNumber,
            title = title,
            town = town,
            street = street,
            house = house,
            company = company,
            previewTextExperience = previewTextExperience,
            textExperience = textExperience,
            fullSalary = fullSalary,
            shortSalary = shortSalary,
            schedules = schedules.split(", "),
            publishedDate = publishedDate,
            isFavorite = isFavorite,
            appliedNumber = appliedNumber,
            description = description,
            responsibilities = responsibilities,
            questions = questions.split(", ")
        )

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

    fun OffersDTOI.mapToData(): OfferModel =
        OfferModel(
            id = id,
            textButton = button?.text,
            title = title,
            link = link
        )

    fun OfferEntity.mapToModel(): OfferModel =
        OfferModel(
            id = id,
            textButton = textButton,
            title = title,
            link = link
        )
}