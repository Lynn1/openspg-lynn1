# -*- coding: utf-8 -*-
# Copyright 2023 OpenSPG Authors
#
# Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
# in compliance with the License. You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software distributed under the License
# is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
# or implied.

# ATTENTION!
# This file is generated by Schema automatically, it will be refreshed after schema has been committed
# PLEASE DO NOT MODIFY THIS FILE!!!
#

from knext.schema.model.schema_helper import (
    SPGTypeHelper,
    PropertyHelper,
    RelationHelper,
)


class SupplyChain:
    class Company(SPGTypeHelper):
        class fundTrans(RelationHelper):
            transAmt = PropertyHelper("transAmt")
            transDate = PropertyHelper("transDate")

        cashflowDiff6Month = PropertyHelper("cashflowDiff6Month")
        name = PropertyHelper("name")
        fundTrans3MonthIn = PropertyHelper("fundTrans3MonthIn")
        cashflowDiff3Month = PropertyHelper("cashflowDiff3Month")
        cashflowDiff1Month = PropertyHelper("cashflowDiff1Month")
        description = PropertyHelper("description")
        fundTrans1Month = PropertyHelper("fundTrans1Month")
        id = PropertyHelper("id")
        fundTrans6MonthIn = PropertyHelper("fundTrans6MonthIn")
        fundTrans6Month = PropertyHelper("fundTrans6Month")
        totalTransInAmt = PropertyHelper("totalTransInAmt")
        fundTrans1MonthIn = PropertyHelper("fundTrans1MonthIn")
        product = PropertyHelper("product")
        fundTrans3Month = PropertyHelper("fundTrans3Month")

        mainSupply = RelationHelper("mainSupply")
        belongToIndustry = RelationHelper("belongToIndustry")
        sameLegalRepresentative = RelationHelper("sameLegalRepresentative")

        fundTrans = fundTrans("fundTrans")

    class CompanyEvent(SPGTypeHelper):

        leadTo = PropertyHelper("leadTo")
        name = PropertyHelper("name")
        eventTime = PropertyHelper("eventTime")
        description = PropertyHelper("description")
        id = PropertyHelper("id")
        trend = PropertyHelper("trend")
        belongTo = PropertyHelper("belongTo")
        index = PropertyHelper("index")
        subject = PropertyHelper("subject")

    class Index(SPGTypeHelper):

        name = PropertyHelper("name")
        stdId = PropertyHelper("stdId")
        alias = PropertyHelper("alias")
        description = PropertyHelper("description")
        id = PropertyHelper("id")

    class Industry(SPGTypeHelper):

        name = PropertyHelper("name")
        stdId = PropertyHelper("stdId")
        alias = PropertyHelper("alias")
        description = PropertyHelper("description")
        id = PropertyHelper("id")

    class Person(SPGTypeHelper):

        certNo = PropertyHelper("certNo")
        legalRepresentative = PropertyHelper("legalRepresentative")
        name = PropertyHelper("name")
        description = PropertyHelper("description")
        id = PropertyHelper("id")
        age = PropertyHelper("age")

    class Product(SPGTypeHelper):

        name = PropertyHelper("name")
        hasSupplyChain = PropertyHelper("hasSupplyChain")
        description = PropertyHelper("description")
        id = PropertyHelper("id")
        belongToIndustry = PropertyHelper("belongToIndustry")
        belongTo = PropertyHelper("belongTo")

    class ProductChainEvent(SPGTypeHelper):

        name = PropertyHelper("name")
        eventTime = PropertyHelper("eventTime")
        description = PropertyHelper("description")
        id = PropertyHelper("id")
        trend = PropertyHelper("trend")
        belongTo = PropertyHelper("belongTo")
        index = PropertyHelper("index")
        subject = PropertyHelper("subject")

        leadTo = RelationHelper("leadTo")

    class TaxOfCompanyEvent(SPGTypeHelper):

        name = PropertyHelper("name")
        stdId = PropertyHelper("stdId")
        alias = PropertyHelper("alias")
        description = PropertyHelper("description")
        id = PropertyHelper("id")

    class TaxOfProdEvent(SPGTypeHelper):

        name = PropertyHelper("name")
        stdId = PropertyHelper("stdId")
        alias = PropertyHelper("alias")
        description = PropertyHelper("description")
        id = PropertyHelper("id")

        leadTo = RelationHelper("leadTo")

    class TaxOfProduct(SPGTypeHelper):

        name = PropertyHelper("name")
        stdId = PropertyHelper("stdId")
        alias = PropertyHelper("alias")
        description = PropertyHelper("description")
        id = PropertyHelper("id")

    class Trend(SPGTypeHelper):

        name = PropertyHelper("name")
        stdId = PropertyHelper("stdId")
        alias = PropertyHelper("alias")
        description = PropertyHelper("description")
        id = PropertyHelper("id")

    Company = Company("SupplyChain.Company")
    CompanyEvent = CompanyEvent("SupplyChain.CompanyEvent")
    Index = Index("SupplyChain.Index")
    Industry = Industry("SupplyChain.Industry")
    Person = Person("SupplyChain.Person")
    Product = Product("SupplyChain.Product")
    ProductChainEvent = ProductChainEvent("SupplyChain.ProductChainEvent")
    TaxOfCompanyEvent = TaxOfCompanyEvent("SupplyChain.TaxOfCompanyEvent")
    TaxOfProdEvent = TaxOfProdEvent("SupplyChain.TaxOfProdEvent")
    TaxOfProduct = TaxOfProduct("SupplyChain.TaxOfProduct")
    Trend = Trend("SupplyChain.Trend")

    pass
