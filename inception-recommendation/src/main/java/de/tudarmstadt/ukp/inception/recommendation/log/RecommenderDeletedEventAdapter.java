/*
 * Copyright 2018
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

package de.tudarmstadt.ukp.inception.recommendation.log;

import de.tudarmstadt.ukp.inception.log.adapter.EventLoggingAdapter;
import de.tudarmstadt.ukp.inception.recommendation.config.RecommenderServiceAutoConfiguration;
import de.tudarmstadt.ukp.inception.recommendation.event.RecommenderDeletedEvent;

/**
 * <p>
 * This class is exposed as a Spring Component via
 * {@link RecommenderServiceAutoConfiguration#recommenderDeletedEventAdapter}.
 * </p>
 */
public class RecommenderDeletedEventAdapter
    implements EventLoggingAdapter<RecommenderDeletedEvent>
{
    @Override
    public boolean accepts(Object aEvent)
    {
        return aEvent instanceof RecommenderDeletedEvent;
    }
}
