/*
 * Copyright 2020
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.tudarmstadt.ukp.inception.workload.extension;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import de.tudarmstadt.ukp.clarin.webanno.support.extensionpoint.ExtensionPoint_ImplBase;
import de.tudarmstadt.ukp.clarin.webanno.ui.core.page.ApplicationPageBase;

@Component
public class WorkloadExtensionPointImpl
    extends ExtensionPoint_ImplBase<ApplicationPageBase, WorkloadExtension>
{

    public WorkloadExtensionPointImpl(
        @Lazy @Autowired(required = false) List<WorkloadExtension> aExtensions)
    {
        super(aExtensions);
    }

    @Override
    public List<WorkloadExtension> getExtensions(ApplicationPageBase aContext)
    {
        Map<String, WorkloadExtension> byRole = new LinkedHashMap<>();
        for (WorkloadExtension extension : super.getExtensions(aContext)) {
            byRole.put(extension.getId(), extension);
        }
        return new ArrayList<>(byRole.values());
    }
}
