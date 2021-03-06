/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.plugins.gaelyk.template

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Gaelyk creator for create a view (Groovy template).
 *
 * @author Benjamin Muschko
 */
class GaelykViewCreator extends GaelykFileCreatorTemplate {
    static final Logger logger = LoggerFactory.getLogger(GaelykViewCreator.class)

    @Override
    File getBaseDir() {
        getWebAppDir()
    }

    @Override
    String getFileExtension() {
        ".gtpl"
    }

    @Override
    String getTemplate() {
        "/template/view.template"
    }

    @Override
    Map getBinding(File destFile) {
        [:]
    }
}
